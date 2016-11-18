package LiveCoding;

public class Demo {

	public static void main(String[] args) {
		System.out.println(56);		
		System.out.println(3.14);
		System.out.println(true);
		System.out.println("Hello World :-)");

		//declare variables
		
		int myFirstInteger = 10;
		boolean myFirstBoolean = true;
	//	float piApproxa = 3.14f;
	//	double euler = 2.714;
		String myString = "Das Programm ist am Ende";
		
		//default value
		int myTest =0 ;
		
		System.out.println(myTest);
		System.out.println("Integer Wert: "+ myFirstInteger +" Boolean Wert: "+ myFirstBoolean);
		
		while (myFirstBoolean !=false){
		
			myFirstInteger = myFirstInteger -1;
			if (myFirstInteger <= 0){
				myFirstBoolean = false;
			}
			else{
			System.out.println("Integer Wert: "+ myFirstInteger);		
		
	}
			
			
			//Übung
		//	int a=9;
			//int b;
			
			
			
		}
		System.out.println(myString);
	}
}

