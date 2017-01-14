package Vererbung;

public class Osterhase extends Hase {

	public Osterhase(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void schlafen (){
		System.out.println("Der Osterhase "+name + " schläft");
	}
	public void hoppeln(){
		System.out.println("Der Osterhase "+name +" hoppelt auf der Wiese");
	}
	public void fressen(){
		System.out.println("Der Osterhase "+name +" frisst das Gras");
	}
	public void functionOster (){
		System.out.println("Der Osterhase "+name +" verteilt Ostereier");
	}

}
