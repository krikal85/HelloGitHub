package Pruefungsvorbereitung;

public class rekursion {

	public static void main(String[] args) {
		sum(3);
		System.out.println(fibonacci(3));

	}

	public static int sum(int n){
		
		if(n > 0){
			
			return sum(n-1)+n;
		}
		else
			return 0;
	}
	
	public static int fibonacci(int n){
		if (n==0){
			return 0;
		}
		else if (n < 2){
			return 1;
		}
		else 
			return fibonacci(n-1)+fibonacci(n-2);
	}
	
}
