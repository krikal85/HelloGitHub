package LiveCoding;

public class matrix {

	public static void main(String[] args) {
		int size = 4;		
		generateIdentityMatrix(size);
	}
	
	public static double [][] generateIdentityMatrix(int size){
		double [ ] [ ] array = new double [size] [size];
		 
		int i;
	
		for(i=0; i<=size-1; i++){
			// setze die Hauptdiagonale
			array[i][i]= 1;
			//OutputHandler
			int m = 0;
			System.out.print("| ");
			while (m < size){
				System.out.print(array[i][m]+" ");
				m++;
			}
			System.out.println("|");
		}
		return array;
	}
}
