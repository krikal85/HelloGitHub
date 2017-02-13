package Pruefungsvorbereitung;

public class Bonus {
	private String Vorname;
	private String Nachname;
	private int Mitarbeiternummer; 
	private double Gehalt;
	private int alter;
	
	public Bonus(String Vorname, String Nachname, double Gehalt){
		this.Vorname= Vorname;
		this.Nachname=Nachname;
		this.Gehalt= Gehalt;
				
		
	}

	public String getNachname() {
		return Nachname;
	}

	public void setNachname(String nachname) {
		Nachname = nachname;
	}

	public double getGehalt() {
		return Gehalt;
	}

	public void setGehalt(double gehalt) {
		Gehalt = gehalt;
	}

	public String getVorname() {
		return Vorname;
	}

	public int getMitarbeiternummer() {
		return Mitarbeiternummer;
	}

	public int getAlter() {
		return alter;
	}
	
	public double monatsAbrechnung(){
		double jahresgehalt = Gehalt*12;
		double sozial = (jahresgehalt/100)*20;
		
		double rest= jahresgehalt -sozial;
		
		double steuer = steuer(rest);
		
		return steuer; 
		
		
	}
	
	private double steuer(double wert){
		double steuer= 0;
		if (wert> 50000){
			steuer = wert - 50000;
			steuer = wert -(steuer*60/100) - 9000 - 3200 - 2000 - 1000; 		
			
		}
		else if (wert > 30000 
				&& wert <=50000){
			steuer = wert - 30000;
			steuer = (wert -(steuer*45/100) -3200 - 2000 - 1000)/12;
			
		}
		else if (wert > 20000 
				&& wert <=30000){
			
			steuer = wert - 20000;
			
			steuer = (wert -(steuer*32/100) - 2000 - 1000)/12;
			
			
		}
		else if (wert > 10000 
				&& wert <=20000){
			steuer = wert - 20000;
			steuer = (wert -(steuer*20/100)  - 1000)/12;
			
		}
		else if (wert <= 10000){
			System.out.println("Unter 10000");
			steuer = wert;
			steuer = (wert -(steuer*10/100))/12;
			
		}
		
		
		wert = steuer;

		return wert;
	}
	
	public double jahresAbrechnung(){
		double jahresgehalt = 12* monatsAbrechnung();
		return jahresgehalt;
	}
	
	public double jahresAbrechnung(int monate){
		double jahresgehalt =monate* monatsAbrechnung();
		return jahresgehalt;
	}
}
