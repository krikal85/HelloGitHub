package LiveCoding;

public class Konto {
	private String Kontoinhaber;
	private double Kontostand;

	public Konto (String inhaber){
		this.Kontoinhaber = inhaber;
		Kontostand = 75;
	}
	public void setInhaber(String name){
		//Konto myKonto = new Konto();
		this.Kontoinhaber = name;
		Kontostand = 0;
	}
	
	public void aufbuchen(double betrag){
	/*	if (Kontoinhaber == null || Kontoinhaber.isEmpty()){
			System.out.println("Kein Inhaber keine Aufbuchung m�glich");
		}
		else{
			this.Kontostand += betrag;
			
		}*/
		
		if (!validate(betrag))
			return ;
		Kontostand += betrag;
		getKontostand();
		
		
	}
	
	private boolean validate (double wert){
		if (wert < 0){
			System.out.println("Abbuchung nicht m�glich sonst w�rde das Konto �berzogen sein");
			return false;
		}
		else{
		return true;
		}
	}
	public boolean abbuchen (double betrag){
		//boolean keineBerichtigung = true;
		
		if (Kontostand - betrag < 0){
			//Kontostand= 0;
			//keineBerichtigung = false;
			System.out.println("Kontostand w�re kleiner Null somit nicht m�glich");
			return false;
		}
		else{
			Kontostand -= betrag;
			getKontostand();
			return true;
		}
	}
	
	public void getKontostand(){
		System.out.println(Kontoinhaber+" hat Kontostand: "+Kontostand);
	}
}
