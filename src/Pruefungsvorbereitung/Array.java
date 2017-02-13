package Pruefungsvorbereitung;

public class Array {

	public static void main(String[] args) {
	 printMatrix(generateIdentityMatrix(5));

	}
	public static double[][] generateIdentityMatrix(int size) {
		double[][] matrix=new double [size][size];
		int one =0;
		for (int x = 0; x < size; x++) {
			for (int y = 0; y < size; y++) {
				if(x==y){
					matrix[x][y]=1.0;
				}
				else
					matrix[x][y]=0.0;
			}
		}
		return matrix;
	}
	
	public static void printMatrix(double[][] matrix){
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix.length; y++) {
				System.out.print(matrix[x][y]+"\t");
				
			}
			System.out.println();
		}
	}
		
			
}
