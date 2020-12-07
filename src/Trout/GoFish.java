package Trout;

import java.util.Random;
import java.util.ArrayList;


public class GoFish
{

    static public ArrayList<Card> deck;
    static final Random rd = new Random();
    static Player[] gamers;

    public static Card pick()
	{
		return deck.remove(rd.nextInt(deck.size()));
	}

	public static int sizeOfDeck()
	{
		return deck.size();
    }

    public static void main(String[] varArgs)
    {

        deck = new ArrayList<Card>();
        for(int i=0; i<4; i++)
            for(Card c: Card.values())
                deck.add(c);
        Player p1 = new Player1();
        Player p2 = new Player2();
        
        gamers = new Player[] {p1, p2}; // 3rd player add

        while(gamers[0].getNumberOfBooks() + gamers[1].getNumberOfBooks() < 13)
        {
            gamers[0].myTimeForPickup();
            System.out.println(deck.size());
            System.out.println("----------");
            gamers[1].myTimeForPickup();
            System.out.println(deck.size());
            System.out.println("----------");
            // 3rd player add
        }

        int player1Runs= gamers[0].getNumberOfBooks();
        int player2Runs = gamers[1].getNumberOfBooks();
        

        if (player1Runs > player2Runs)
            System.out.println("Player 1 won the match");
        else if (player2Runs > player1Runs)
            System.out.println("Player 2 wins the match");
        else
            System.out.println("It's a tie!");
    }
}
