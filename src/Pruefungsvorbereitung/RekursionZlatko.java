package Pruefungsvorbereitung;

public class RekursionZlatko {

	public static void main(String[] args) {
		System.out.println(rec(12));

	}
	
	public static int rec(int number){
		if(number <= 0){
			return 0;
		}
		else
			System.out.println(number);
			return rec(number-1);
			
	}

}
