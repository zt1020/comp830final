package goFish;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeckOfCards deck = DeckOfCards.getInstance();
		deck.generate();
		deck.shuffle();
		CardsDistribution carddist = new CardsDistribution();
		Player p1 = new Player1(carddist.distribute());
		Player p2 = new Player2(carddist.distribute());
		
		System.out.println(p1.cards);
		System.out.println(p2.cards);
		
		
		List<Player> playerList = new ArrayList<Player>();
		
		
	}

}



