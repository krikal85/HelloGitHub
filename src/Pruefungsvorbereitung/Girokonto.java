package Pruefungsvorbereitung;

public class Girokonto extends Konto {

	private double limit;
	
	public Girokonto(String inhaber, double limit) {
		super(inhaber);
		this.limit=limit;
	}
	
	@Override
	public void einzahlen(double wert){
		double kontostand = getKontostand();
		kontostand +=wert;
	}
	
	public void ausnzahlen(double wert){
		double kontostand = getKontostand();
		if(kontostand >= -limit){
			kontostand =kontostand - wert;
		}
		else
			System.out.println("Limit erreicht");
	}

	public double getLimit() {
		return limit;
	}

}
