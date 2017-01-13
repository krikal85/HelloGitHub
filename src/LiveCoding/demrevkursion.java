package LiveCoding;

public class demrevkursion {

	public static void main(String[] args) {
		
	}
	
	public static int recursiveSum(int n){
		if (n == 0){
			return 0;
		}
		else{
			return recursiveSum(n-1)+n;
		}
	}

}
