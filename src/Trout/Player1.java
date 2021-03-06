package Trout;

import java.util.Scanner;

class Player1 extends Player
{
    public void myTimeForPickup()
    {
        Scanner input = new Scanner(System.in);
        boolean onGame = true;

        do
        {
            Card card = checkForBooks();
            if(card!= null)
                System.out.println("Player 1 gains a book of " + card + "s!");

            if (myTurn.size() == 0)
            {
                System.out.print("Player 1, you dont have cards, you must ");
                break;
            }
            else
            {
                System.out.print("Player 1's turn:");
                for(Card c: myTurn)
                    System.out.print(c + " ");
                System.out.println();
            }

            System.out.println("Ask other player for which card? ");
            Card request;
            try{
                request = Card.valueOf(input.next().toUpperCase());
            }
            catch(Exception e){
                System.out.println("There is no cards in this deck. Please Try again:");
                continue;
            }

            if(!myTurn.contains(request))
            {
                System.out.println("Player 1, You don't request for a card because you don't have any card. Please Try again:");
                continue;
            }

            System.out.println("Player 1, You can request for a " + request);
            onGame = askFor(request);
        } while(onGame);
        System.out.println("Go fish!");
        fish();
    }
}
