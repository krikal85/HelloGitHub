package LiveCoding;

public class fibonacci {

	public static void main(String[] args) {
		int endFibonacci = fibonacci(4);
		System.out.println(endFibonacci);
		
	}
	
	public static int fibonacci(int n){
		if (n==0){
			return 0;
		}
		else if (n  < 2 ){
			return 1 ;
		}
		else {
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}

}
