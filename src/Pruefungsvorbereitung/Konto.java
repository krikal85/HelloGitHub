package Pruefungsvorbereitung;

public class Konto {
	private String inhaber;
	private double kontostand;
	
	public Konto (String inhaber){
		this.inhaber=inhaber;
		kontostand =0;
	}
	
	public void einzahlen(double wert){
		kontostand = kontostand +wert;
	}
	
	public double getKontostand() {
		return kontostand;
	}

	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}

	public void ausnzahlen(double wert){
		kontostand = kontostand - wert;
	}
}
