package LiveCoding;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] array1={3,4,5};
		int[] array2 = new int[3];
		array2[0] = 7;
		array2[1] = 1;
		array2[2] = 3;
		
		
		System.out.println("+ "+(array1[0] + array2[0])+","+ (array1[1] + array2[1])+","+(array1[2] + array2[2])) ;
		System.out.println("* "+(array1[0] * array2[0])+","+ (array1[1] * array2[1])+","+(array1[2] * array2[2])) ;
		
		int sum = 0;
		int mult = 0;
		int[] result = new int[3];
		int[] resultMult = new int[3];
		for (int i = 0; i <=2;i++){
			sum = array1[i]+array2[i];
			mult = array1[i]* array2[i];
			result[i] = sum;
			resultMult[i] = mult;
		}
		System.out.println("Mit Schleife:");
		System.out.println("+ "+(result[0])+" "+(result[1])+" "+(result[2]));
		System.out.println("* "+(resultMult[0])+" "+(resultMult[1])+" "+(resultMult[2]));
	}

}
