package LiveCoding;

public class ggt{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOne = 6;
		int numberTwo = 3;
		if (numberOne < 0 || numberTwo < 0){
			System.out.println("This programm is just working with positive numbers");
		}
		else {
			int solution = ggT (numberOne, numberTwo);
			System.out.println("The ggt of " + numberOne + " and " + numberTwo + " is: " + solution );
		}

	}
	
	private static int ggT(int a, int b){
		if (a == 1 || b == 1){
			a = 1;
			return a;
		}
		else {
			while (a > 0 && b > 0){
				if (a > b){
					a = a % b;	
				}
				else{
					b = b % a;
				}
			}
			a = a + b;
			return a;
		}
		}

	

}