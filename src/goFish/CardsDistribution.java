package goFish;

import java.util.*;

public class CardsDistribution {
	public void distributeCards(int players) {
		List<Player> playerList = new List<Player>();
		Set<String> cards = new HashSet<String>(new DeckOfCards().generate());// card shuffling
		ArrayList<String> cardList = new ArrayList<String>(cards);
		if (players > 2 && players <= 7) {
			if (players == 3) {
				ArrayList<String> p1Cards = new ArrayList<String>();
				ArrayList<String> p2Cards = new ArrayList<String>();
				ArrayList<String> p3Cards = new ArrayList<String>();
				ArrayList<String> remainingCards = new ArrayList<String>();
				for (int i = 0; i < cardList.size(); i++) {
					if (i < 5) {
						p1Cards.add(cardList.get(i));
					} else if (i >= 5 && i < 10) {
						p2Cards.add(cardList.get(i));
					} else if (i >= 10 && i < 15) {
						p3Cards.add(cardList.get(i));
					} else {
						remainingCards.add(cardList.get(i));
					}
				}
				Player p1 = new Player(p1Cards);
				Player p2 = new Player(p2Cards);
				Player p3 = new Player(p3Cards);
				playerList.add(p1);
				playerList.add(p2);
				playerList.add(p3);
//playerList.add(new Player(p1Cards));
//playerList.add(new Player(p2Cards));
//playerList.add(new Player(p3Cards));

			}
		} else if (players == 2) {

		}
	}
}
