package LiveCoding;

public class verwaltungsstrafe {

	public static void main(String[] args) {
		
		Strafen myStrafe = new Strafen ("Martin","Tatscher","BM789NE");
		myStrafe.strafe(10);
		System.out.println("Der Halter : "+myStrafe.getVorname()+" "+myStrafe.getNachname()+" mit dem Kennzeichen: "+myStrafe.getKennzeichen()+" muss eine Strafe von "+myStrafe.getStrafe()+" Euro bezahlen :Anzahl "+myStrafe.getAnzahl()+" Strafnummer: "+myStrafe.getStrafnummer());
		myStrafe.alkohol(2.0);
		myStrafe.verbandspaket();
		myStrafe.sonstiges(2);
		System.out.println("Der Halter : "+myStrafe.getVorname()+" "+myStrafe.getNachname()+" mit dem Kennzeichen: "+myStrafe.getKennzeichen()+" muss eine Strafe von "+myStrafe.getStrafe()+" Euro bezahlen :Anzahl "+myStrafe.getAnzahl()+" Strafnummer: "+myStrafe.getStrafnummer());
		
		
		
	}

}
