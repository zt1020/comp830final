package goFish;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeckOfCards deck = new DeckOfCards();
		deck.generate();
	}

}

public class Player{
public List<String> cards = new ArrayList<String>();
public Player(List<String> cards){
this.cards = cards;
}
}
