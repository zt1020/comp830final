package goFish;

import java.util.*;

public class CardsDistribution {

	DeckOfCards deck = DeckOfCards.getInstance();

	public List distribute() {
		List<String> pCards = new ArrayList<String>();
		if (deck.deck.size() != 0) {


			for (int i = 0; i < deck.deck.size(); i++) {
				if (i < 7) {
					pCards.add(deck.deck.get(i));
					deck.deck.remove(i);
				}
			}		
		}

		return pCards;
	} 

	
}

