package goFish;

import java.util.*;

public class CardsDistribution {
	public void distributeCards(int players) {
		List<Player> playerList = new ArrayList<Player>();
		List<String> cards = new ArrayList<String>(new DeckOfCards().generate());// card shuffling
		Collections.shuffle(cards);
		ArrayList<String> cardList = new ArrayList<String>(cards);
		if (players > 2 && players <= 7) {
			if (players == 3) {
				ArrayList<String> p1Cards = new ArrayList<String>();
				ArrayList<String> p2Cards = new ArrayList<String>();
				ArrayList<String> p3Cards = new ArrayList<String>();
				ArrayList<String> remainingCards = new ArrayList<String>();
				for (int i = 0; i < cardList.size(); i++) {
					if (i < 7) {
						p1Cards.add(cardList.get(i));
						cardList.remove(i);
					} else if (i >= 7 && i < 14) {
						p2Cards.add(cardList.get(i));
						cardList.remove(i);
					} else if (i >= 14 && i < 21) {
						p3Cards.add(cardList.get(i));
						cardList.remove(i);
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
				
				System.out.println(cardList.size());
				
				System.out.println(p1Cards);
				System.out.println(p2Cards);
				System.out.println(p3Cards);
//playerList.add(new Player(p1Cards));
//playerList.add(new Player(p2Cards));
//playerList.add(new Player(p3Cards));

			}
		} else if (players == 2) {

		}
		
	}
}
