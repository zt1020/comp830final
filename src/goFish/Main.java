package goFish;
import java.util.*;
public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeckOfCards deck = DeckOfCards.getInstance();
		deck.generate();
		deck.shuffle();
		CardsDistribution carddist = new CardsDistribution();
		Player p1 = new Player1(carddist.distribute());
		Player p2 = new Player2(carddist.distribute());
		
		System.out.println("Player 1 hand: " +p1.hand);
		System.out.println("Player 2 hand: " +p2.hand);
		System.out.println("Deck size before card draw: " +deck.deck.size());
		p1.cardDraw();
		System.out.println("Player 1 hand after card draw: " +p1.hand);
		System.out.println("Player 2 hand after card draw (unchanged): " +p2.hand);
		System.out.println("Deck size after card draw: " +deck.deck.size());
		
		
		List<Player> playerList = new ArrayList<Player>();
		
		
	}

}



