package main;

import java.util.Random;

public class Deck {
	public int shuffleNumber = 100;
	public int getShuffleNumber() {
		return shuffleNumber;
	}

	public void setShuffleNumber(int shuffleNumber) {
		this.shuffleNumber = shuffleNumber;
	}

	private Random rand      = new Random();
	private Card[] cards     = new Card[52];
	
	public void initalize() {
								// Kreuz	  Pik		Herz	  Karo
		final String colours[] = {"\u2667", "\u2664", "\u2661", "\u2662"};
		final String values [] = {"A", "K", "D", "B", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
		
		int i = 0;
		for (String c : colours) {
			for (String v : values) {
				cards[i] = new Card();
				cards[i].setColour(c);
				cards[i].setValue(v);
				i++;
			 }
		}
	}
	
	@Override
	public String toString() {
		String result = "";
		
		int i = 1;
		for(Card c : cards) {
			result += "[";
			result += c.getColour();
			result += c.getValue();
			result += "]";
			if(i%5 == 0) {
				result += "\n";
			}
			i++;
		}
		
		return result;
	}
	
	private void exchangeTwoCards(int pos1, int pos2) {
		Card first  = cards[pos1];
		Card second = cards[pos2];
		
		cards[pos2] = first;
		cards[pos1] = second;
	}
	
	public void shuffle() {
		for(int i = 0; i < shuffleNumber; i++) {
			int rand1 = rand.nextInt(52);
			int rand2 = rand.nextInt(52);
			
			exchangeTwoCards(rand1, rand2);
		}
	}
	
	public Card getCard(int pos) {
		return null;
	}
}
