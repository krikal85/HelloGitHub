package LiveCoding;

public class bruchRechnung {

	public static void main(String[] args) {
		//Create Brüche
		Bruch myBruch = new Bruch (6,3);
		Bruch myOtherBruch = new Bruch (2,2);
		Bruch myNewBruch = new Bruch(0,0);
		Bruch myNewBruch2 = new Bruch(0,0);
				
		myBruch.print();
		myOtherBruch.print();
		System.out.println("Dezimalanzeige "+myBruch.toDecimal());
	
		myNewBruch = myNewBruch.multiplicate(myBruch);
		myNewBruch.print();
	
		myNewBruch2 = myNewBruch2.multiplicate(myBruch, myOtherBruch);
		myBruch.print();

	}

}
