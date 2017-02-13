package Pruefungsvorbereitung;

public class DemoFourWins {

	public static void main(String[] args) {
		
		FourWins myGame = new FourWins(6, 8);
		
		myGame.playerA(1, 1);
		myGame.playerB(1, 2);
		System.out.println("Gewinner: "+myGame.winner());
		myGame.playerA(1, 3);
		myGame.playerB(1, 4);
		myGame.playerB(2, 2);
		myGame.playerA(3, 2);
		myGame.playerB(4, 2);
		myGame.playerA(0, 0);
		myGame.playerA(1, 0);
		myGame.playerB(2, 0);
		myGame.playerA(3, 0);
		myGame.printCharArray();
		
		System.out.println("Gewinner: "+myGame.winner());
		

	}

}
