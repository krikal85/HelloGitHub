package LiveCoding;

public class winterreifenPflichtDemo {

	public static void main(String[] args) {
		int temperatur = 5; 
		boolean rutschigeFahrbahn = true;
		boolean result;
		 result = isWinterreifenPflicht(temperatur,rutschigeFahrbahn);
		 System.out.println("Winterreifenplicht: "+result);
		

	}
	public	static	boolean	isWinterreifenPflicht(int temperatur,boolean rutschigeFahrbahn)	{
		boolean winterreifen;
		if((temperatur < 10 && rutschigeFahrbahn == true)|| temperatur <4 ){
			winterreifen = true;
		}
		else{
			winterreifen = false;
		}
			
		return winterreifen; 
	}
}
