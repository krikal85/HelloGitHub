package Pruefungsvorbereitung;

public class JugenGiroKonto extends Girokonto {
	private double buchungslimit;
	
	public JugenGiroKonto(String inhaber, double limit, double buchungslimit) {
		super(inhaber, limit);
		this.buchungslimit = buchungslimit;
	}

	@Override
	public void einzahlen(double wert){
		double kontostand = getKontostand();
		if(wert<=buchungslimit){
			kontostand +=wert;
		}
		else
			System.out.println("Aufbuchung nicht möglich : Buchungslimit erreicht");
	}
	
	public void ausnzahlen(double wert){
		double kontostand = getKontostand();
		if(kontostand >= -(getLimit())){
			if(wert<=buchungslimit){
				kontostand =kontostand - wert;
			}
			else
				System.out.println("Abbuchung nicht möglich : Buchungslimit erreicht");
		}
		else
			System.out.println("Limit erreicht");
	}
}
