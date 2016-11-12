package LiveCoding;

public class TeilerFinden {

	public static void main(String[] args) {
		int nummer = 12;
		int teiler = 2;
		int result = 0;
		int i = 1;
		int[] myArray = new int [100];
		while ( teiler != nummer){
			result = nummer % teiler;
			if (result == 0){
				myArray[i]= result;
				System.out.println(teiler+" ist Ganzzahliger Teiler von "+teiler);
				i++;
			}
			else{
				System.out.println(teiler+" ist kein Ganzzahliger Teiler von "+teiler);
			}
			teiler++;
		}

	}

}
