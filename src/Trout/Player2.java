package Trout;

import java.util.ArrayList;

class Player2 extends Player
{
    public ArrayList<Card> list = new ArrayList<Card>();
    private int life = 0;


    private Card player2Show()
    {
        if (life>2)
        {
            list.remove(list.size()-1);
            life=0;
        }

        for(int i=list.size()-1; i>-1; i--)
            if (myTurn.contains(list.get(i)))
            {
                return list.remove(i);
            }
        return myTurn.get(GoFish.rd.nextInt(myTurn.size()));
    }

    public void myTimeForPickup()
    {
        boolean onGame;
        do{
            Card cardBook = checkForBooks();
            if(cardBook != null)
                System.out.println("Another Player got a book of " + cardBook + "s...");
            if (myTurn.size() == 0)
            {
                System.out.print(" Your opposite player hand is empty.");
                break;
            }
            Card request = player2Show();
            System.out.println("Opposite player requests for the deck by the name of " + request);
            onGame = askFor(request);
            life++;
        } while(onGame);
        System.out.println("Your opposite player goes picking cards from deck");
        fish();
    }

}
