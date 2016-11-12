package LiveCoding;

public class ArrayDemo2 {

	public static void main(String[] args) {
		String[] Monat = {"Jänner", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
		for (int i=0; i <=Monat.length-1; i++){
			String Ausgabe = Monat[i];
			int numberMonth = i+1;
			System.out.println(Ausgabe + "["+numberMonth+"]");
		}
	}

}
