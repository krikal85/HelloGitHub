package LiveCoding;

public class bruchRechnung {

	public static void main(String[] args) {
		//Create Brüche
		Bruch myBruch = new Bruch (5,7);
		System.out.println("b1 "+myBruch.anzahlObjekte);
		System.out.println("Bruch " +Bruch.anzahlObjekte);
		Bruch myOtherBruch = new Bruch (3,4);
		
		Bruch myNewBruch = new Bruch(0,0);
		Bruch myNewBruch2 = new Bruch(0,0);
				
		myBruch.print();
		myOtherBruch.print();
		System.out.println("Dezimalanzeige "+myBruch.toDecimal());
	
		myNewBruch = myBruch.multiplicate(myOtherBruch);
		myBruch.print();
	
		myNewBruch2 = myBruch.multiplicate(myOtherBruch,myBruch);
		myNewBruch2.print();
		
		

	}

}
