package main;


public class Game {
	private int round;
	private int moneyOnTable;
	private Card[] cardsOnBoard = new Card[5];
	private Player[] players;
	
	Game(int playerNumber) {
		players = new Player[playerNumber];
	}
	
	public void dealCardsToPlayer(Deck deck) {
		int cardsDealed = 0;
		
		for(int i = 0; i < 2; i++) {
			for( Player p : players) {
				p.addNextCard(deck.getCard(cardsDealed));
				cardsDealed++;
			}
		}
	}
	
	public void showPlayerCards() {
		for( Player p : players) {
			
		}
	}
}
