package LiveCoding;

public class Gehaltskonto {
	
	private String Kontoinhaber;
	private String iban;
	private String bic;
	private double Kontostand;
	
	//Konstruktor
	
	public Gehaltskonto(String inhaber,String iban, String bic){
		
		this.Kontoinhaber = inhaber;
		this.iban = iban;
		this.bic = bic;
		this.Kontostand = 0;
		
		
	}
	
	//öffentliche Methoden - getter setter 
	public String getKontoinhaber() {
		if(Kontoinhaber == null || Kontoinhaber.isEmpty()){
			//System.out.println("keint Kontoinhaber gesetzt");
			return "Kein Inhaber";
		}
		//else
		return Kontoinhaber;
	}

	public void setKontoinhaber(String kontoinhaber) {
		Kontoinhaber = kontoinhaber;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		if(iban.length()<20){
			System.out.println("Iban muss 2o Stellig sein");
			return;	
		}
		this.iban = iban;
		
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public double getKontostand() {
		return Kontostand;
	}
	

	public void setKontostand(double kontostand) {
		Kontostand = kontostand;
	}

	//Functionality	

	
	private boolean validate (double wert){
		
		if(Kontoinhaber == null || Kontoinhaber.isEmpty()){
			System.out.println("Ein Kontoinhabernhaber muss gesetzt werden");
			return false;
		}
		if (wert < 0){
			System.out.println("Es ist nicht möglich einen negativen Wert aufzubuchen");
			return false;
		}
		//else
		return true;
		
	}
	
	public void aufbuchen(double betrag){
		
		if (!validate(betrag))
			return ;
		Kontostand += betrag;
		
		
		
	}
	
	public void abbuchen (double betrag){
		
		if(!validate(betrag))
			return;
		if (Kontostand - betrag < 0){
			System.out.println("Der Betrag "+betrag+" kann leider nicht abgebucht werden da der Kontostand("+Kontostand+") zu gering ist.");
			return;
		}
		else{
			Kontostand -= betrag;
			return;
		}
	}
	
	
	
}
