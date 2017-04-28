package main;

public class Player {
	private int money;
	private Card[] cards = new Card[2];
	private int actPos   = 0;
	
	public void addNextCard(Card card) {
		cards[actPos] = card;
		actPos++;
	}
	
	public void showCards() {
		for(Card c : cards) {
			c.getValue();
			c.getColour();
		}
	}
}
