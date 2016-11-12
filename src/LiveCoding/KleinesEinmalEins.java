package LiveCoding;

public class KleinesEinmalEins {

	public static void main(String[] args) {
		//dec var
		int result = 1;
		int size = 10;
		int[] array2 = new int[size];
		int[] array = new int[size];
		int a =1;
		//-----------
		
		System.out.println("---------------schleifen-----------------------------------------------------");
		
		for (int i = 1; i <=size; i++){
			for (int number = 1; number <=size; number++){
				result=number*i;
				System.out.print(result+"\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("------------Array------------------------------------------------------------");
		
		//befülle das Array
		for (int i=0;i<size;i++){
				array[i]=array[i]+a;
				
				a++;
			}
		
		for(int n=1;n<size+1;n++){
			for(int i=0;i<size;i++){
				array2[i]=array[i]*(n);
				}
			int m = 0;
			while (m < size){
				System.out.print(array2[m]+"\t ");
				m++;
			}
			System.out.println();						
		}
		System.out.println("-----------------------------------------------------------------------------");
	}

}
