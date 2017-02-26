package org.campusblackjackprüfung;

public class DemoBlackjack {

	public static void main(String[] args) {
		Player viki = new Player("Viki", 24);
		Player eli = new Player("Eli", 24);
		
		Blackjack game = new Blackjack();
		game.add(viki);
		game.add(eli);
		game.addCard(viki,12);
		game.addCard(eli,22);
		
	

	}

}
