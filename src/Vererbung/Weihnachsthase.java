package Vererbung;

public class Weihnachsthase extends Hase {

	public Weihnachsthase(String name) {
		super(name);
		
	}
	public void schlafen (){
		System.out.println("Der Weihnachtshase "+name + " schläft");
	}
	public void hoppeln(){
		System.out.println("Der Weihnachtshase "+name +" hoppelt im Schnee");
	}
	public void fressen(){
		System.out.println("Der Weihnachtshase "+name +" frisst Kekse");
	}
	public void verteiltGeschenke(){
		System.out.println("Der Weihanchtshase "+name +" verteilt geschenke");
	}
	
}
