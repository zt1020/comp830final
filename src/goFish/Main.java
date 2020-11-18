package goFish;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeckOfCards deck = new DeckOfCards();
		deck.generate();
		deck.shuffle();
		CardsDistribution carddist = new CardsDistribution();
		carddist.distributeCards(3);
		
		
	}

}



