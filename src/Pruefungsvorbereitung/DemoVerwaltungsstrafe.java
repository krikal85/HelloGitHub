package Pruefungsvorbereitung;

public class DemoVerwaltungsstrafe {

	public static void main(String[] args) {
		Verwaltungsstrafe meineStrafe = new Verwaltungsstrafe("Viktoria", "Schlaipfer", "G522NE");
		meineStrafe.strafe(100);
		//meineStrafe.strafe(22);
		//meineStrafe.alkohol(0.6);
		//meineStrafe.sonstige(12);
		System.out.println("ZU bezahlen:"+meineStrafe.getStrafe()+" Euro");

	}

}
