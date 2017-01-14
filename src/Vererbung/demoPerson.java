package Vererbung;

public class demoPerson {
	public static void main(String[] args) {
		Customer myCustomer = new Customer("Viktoria", "Schlaipfer", 1);
		System.out.println("Vorname: "+myCustomer.getFirstname() +" Nachname: "+myCustomer.getLastname());
	}
}
