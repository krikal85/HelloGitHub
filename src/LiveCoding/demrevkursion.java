package LiveCoding;

public class demrevkursion {

	public static void main(String[] args) {
		int sum = recursiveSum(5);
		System.out.println(sum);
		int faktorielle = nFaktorielle(10);
		System.out.println(faktorielle);
	}
	
	public static int recursiveSum(int n){
		if (n == 0){
			return 0;
		}
		else{
			return recursiveSum(n-1)+n;
		}
	}

	public static int nFaktorielle(int n){
		if (n == 0){
			return 1;
		}
		else{
			return nFaktorielle(n-1)*n;
		}
	}

}
