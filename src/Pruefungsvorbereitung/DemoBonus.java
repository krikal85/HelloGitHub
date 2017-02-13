package Pruefungsvorbereitung;

public class DemoBonus {

	public static void main(String[] args) {
		Bonus myBonus = new Bonus("Viki","Schlaipfer", 2333.33);
		System.out.println("Monatsabrechnung: "+ myBonus.monatsAbrechnung());
		System.out.println("Jahresabrechnung"+myBonus.jahresAbrechnung());
		System.out.println("Jahresabrechnung2"+myBonus.jahresAbrechnung(2));

	}

}
