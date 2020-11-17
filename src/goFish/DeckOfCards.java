package goFish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class DeckOfCards {

	public List<String> deck = new ArrayList<String>();
	
	public void generate() {
		
		for (int i = 1; i<14; i++) {
			deck.add(Integer.toString(i));
			deck.add(Integer.toString(i));
			deck.add(Integer.toString(i));
			deck.add(Integer.toString(i));
			
		}
		for (int i = 0; i<deck.size(); i++) {
			System.out.println(deck.get(i));
		}
		
		for (int i=0; i<deck.size(); i++) {
            if (deck.get(i).equals("1") ) {
                deck.set(i, "A");
                } else if (deck.get(i).equals("11")) {
                	deck.set(i, "J");
                } else if (deck.get(i).equals("12")) {
                	deck.set(i, "Q");
                } else if (deck.get(i).equals("13")) {
                	deck.set(i, "K");
                }
            
		}
		System.out.println(deck);
	}
	
	public void shuffle() {
		
		Collections.shuffle(deck);
		System.out.println(deck);
	}
	
}

