package Vererbung;

public class Hase {
	protected String name;
	
	public Hase(String name) {
		this.name = name;
	}
	
	public void schlafen (){
		System.out.println("Der Hase "+name + "schl�ft");
	}
	public void hoppeln(){
		System.out.println("Der Hase "+name +"hoppelt");
	}
	public void fressen(){
		System.out.println("Der Hase "+name +"frisst");
	}
	

}
