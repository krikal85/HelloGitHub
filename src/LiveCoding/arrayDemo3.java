package LiveCoding;

public class arrayDemo3 {

	public static void main(String[] args) {
		
		//defintion array und var
		int[] myArray = {12,1,3,5,1};
		int myNumber = 12;
		boolean numberInArray = containsNumber(myArray,myNumber);
		System.out.println("Nummer "+myNumber+"in Array vorhanden? "+numberInArray);
		int sum = calculateSum(myArray);
		System.out.println("Summe des Arrays: "+sum);
		printArray(myArray);
		System.out.println();
		int [] reverseArray = new int [myArray.length];
		reverseArray = reverse(myArray);
		System.out.println("Reverse Array: ");
		for (int i =0; i <reverseArray.length;i++){
			System.out.print(reverseArray[i]+"\t");
		}
		
	}
	
	public static boolean containsNumber(int[] numbers, int n){
		boolean isTrue = false;
		for (int i = 0; i <numbers.length;i++){
			int numbers2 = numbers[i];
			if(numbers2!=n){
				isTrue=false;
			}
			else{
				isTrue = true;
				break;
			}
		}
		return isTrue;
	}
	
	public static int calculateSum(int[] numbers) {
		int sum = 0;
		for(int i=0;i<numbers.length;i++) {
			sum = sum + numbers[i];
		}
		return sum;
	}
	
	public static void printArray(int[] numbers){
		for(int i=0;i<numbers.length;i++){
			//int myI = i-1;
			System.out.print(numbers[i]+",");
		}
	}
	
	//reverse array
	public static int[] reverse(int[] original){
		int [] revereseArray = new int [original.length];
		int length = original.length;
		System.out.println("Länge original Beginn "+length);
		
		for (int i=0; i<original.length;i++){
			
			int length2 = length-i-1;
			revereseArray[length2]=original[i];
		}
		return revereseArray;
	}
}

