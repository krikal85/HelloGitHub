package LiveCoding;

public class charArrayDemo {

	public static void main(String[] args) {
		
		char[] myArray = new char[]{'a','b','c','d'};
		char[] test2 = new char [4];
		test2[0]='e';
		test2[1]='f';
		test2[2]='g';
		test2[3]='h';
		
		String testString = "Hallo PR1 in Graz, am Freitag!";
		char[] testFromString = testString.toCharArray();
		CharArray a0 = new CharArray(myArray);
		CharArray a1 = new CharArray(testFromString);
		a1.print();
		a1.print(4,10);
		System.out.println(a1.length());
		System.out.println("Anzahl CharArray "+CharArray.countObjects);
		

	}

}
