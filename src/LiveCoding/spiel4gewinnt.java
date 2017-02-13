package LiveCoding;

public class spiel4gewinnt {

	public static void main(String[] args) {
		FourWins myGame = new FourWins(5, 6);
		myGame.playerA(1, 2);
		/*myGame.playerB(0,3);
		myGame.playerB(1,3);
		myGame.playerB(2,3);
		myGame.playerB(3,3);*/
		myGame.playerA(0,4);
		System.out.println("Gewinner 1: "+myGame.winner());
		myGame.playerA(1,4);
		myGame.playerB(2,4);
		myGame.playerA(3,4);
		myGame.playerA(4,4);
		myGame.printCharArray();
		System.out.println("Gewinner 2: "+myGame.winner());
		myGame.playerB(0,1);
		myGame.playerB(0,2);
		myGame.playerB(0,3);
		myGame.playerB(0,0);
		myGame.printCharArray();
		System.out.println("Gewinner: "+myGame.winner());
		


	}

}
