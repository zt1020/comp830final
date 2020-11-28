import java.util.ArrayList;

enum Card
{
    ACE, FOUR, FIVE, EIGHT, NINE, KING, JACK, QUEEN, TEN, TWO, THREE,  SIX, SEVEN;
}

abstract class Player
{
    protected ArrayList<Card> myTurn = new ArrayList<Card>();
    private int numberOfBooks;

    public Player()
    {
        for(int i=0;i<8;i++)
            fish();
    }

    public boolean haveGivingCard(Card c)
    {
        return myTurn.contains(c);
    }

    protected boolean askFor(Card cardType)
    {
        int var = 0;
        if (this instanceof Player1)
            var = 1;
        Player other = GoFish.gamers[var];

        if (var == 1)
            ((Player2) other).list.add(cardType);

        if (other.haveGivingCard(cardType))
        {
            for(Card c: other.giveAll(cardType))
                myTurn.add(c);
            return true;
        }
        else
        {
            return false;
        }
    }


    public ArrayList<Card> giveAll(Card c)
    {
        ArrayList<Card> newList = new ArrayList<Card>();
        for(int k=0; k<myTurn.size();k++)
            if (myTurn.get(k) == c)
              newList.add(myTurn.get(k));
        for(int j=0; j<newList.size(); j++)
            myTurn.remove(c);
        return newList;
    }


    protected void fish()
	{
	        if (GoFish.sizeOfDeck() > 0) {
	        	myTurn.add(GoFish.pick());
	        	}
	        else
	        	System.out.println("Yes, It's impossible because of cards in hand is empty.");
    }

    public int getNumberOfBooks()
    {
        return numberOfBooks;
    }

    protected Card checkForBooks()
    {
        for(Card c: myTurn)
        {
            int val = 0;
            for(Card d: myTurn)
              if (c == d)
                  val++;
            if (val == 4)
            {
                for(int i=0;i<4;i++)
                    myTurn.remove(c);
                numberOfBooks++;
                return c;
            }
        }
        return null;
    }

    public abstract void myTimeForPickup();

}
