package Vererbung;

public class Customer extends Person{
	int id;
	
	public Customer(String fn, String ln, int id){
		//Änderung wenn Konstruktor ins Basisklasse
		super(fn,ln);
		
		//Änderung für nur Private
		//setFirstname(fn);
		//setLastname(ln);
				
		this.id =id;
		
		
	}
	
	public void getInfo(){
		System.out.println("This is a customer!");
	}
}
