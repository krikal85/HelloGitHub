package LiveCoding;

public class matrix {

	public static void main(String[] args) {
		int sizeOfMatrix = 6;		
		generateIdentityMatrix(sizeOfMatrix);
	}
	
	public static double [][] generateIdentityMatrix(int size){
		double [ ] [ ] array = new double [size] [size];
		for(int i=0; i<=size-1; i++){
			// setze die Hauptdiagonale
			array[i][i]= 1;		
		}
		printMatrix(array);
		return array;
	}
	
	public static void printMatrix(double[][] matrix){
		
		int size = matrix.length;
		for(int i=0; i<=size-1; i++){
			int m = 0;
			System.out.print("| ");
			while (m < size){
				System.out.print(matrix[i][m]+" ");		
				m++;
			}
			System.out.println("|");
		}
	}
}
