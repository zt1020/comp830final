
package goFish;

import java.util.ArrayList;
import java.util.List;

abstract class Player {
	public List<String> hand = new ArrayList<String>();
	private int numBooks;
	public Player(List<String> cards){
	this.hand = cards;
	}
	
	DeckOfCards deck = DeckOfCards.getInstance();
	
	public void cardDraw() {
		hand.add(deck.deck.get(0));
		deck.deck.remove(0);
	}
	
}



