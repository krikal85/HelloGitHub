package LiveCoding;

public class Würfelspiel {

	public static void main(String[] args) {
		
		int diceEye = 0;
		diceEye= triesUntilThreeOnes();
		System.out.println("Anzahl der Versuche: "+diceEye);
		
	}
	public	static	int	triesUntilThreeOnes(){
		int dice = 0;
		int one = 0;
		int tries = 0;
		while (one < 3){
		dice = 1 + (int)(Math.random() * 6);
		//System.out.println("Augenzahl: "+dice);
			if (dice == 1){
				one ++;
			}
		tries++;
		}
		return tries;
	}
}
