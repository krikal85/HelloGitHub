package LiveCoding;

public class Bonusberechnung {
	private String vorname;
	private String nachname;
	private int mitarbeiternummer;
	private double gehalt;
	private int alter;
	
	public Bonusberechnung (String vorname, String nachname, double gehalt){
		this.vorname = vorname;
		this.nachname = nachname;
		this.gehalt = gehalt;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public double getGehalt() {
		//this.gehalt = gehalt;
		gehalt = (gehalt *12);
		//System.out.println("Get1 "+gehalt);
		double gehalt = this.gehalt-(this.gehalt*20/100);
		//System.out.println("Get "+gehalt);
		return gehalt;
	}

	public void setGehalt(double gehalt) {
		
		
	}

	public String getVorname() {
		return vorname;
	}

	public int getMitarbeiternummer() {
		return mitarbeiternummer;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}
	
	public double monatsAbrechnung(){
		double gehalt2 = getGehalt();
		//System.out.println("Monat "+gehalt2);
		//gehalt = 22400;
		double newSteuer = steuer(gehalt2);
		//System.out.println("newSteuer "+newSteuer);
		
		return newSteuer;
		
	}
	
	public double jahresAbrechung(){
		double result = 12 * monatsAbrechnung();
		return result;
	}
	
	public double jahresAbrechung(int monate){
		double result = monate * monatsAbrechnung();
		return result;
	}
	
	private double steuer(double wert){
		double steuer= 0;
		if (wert> 50000){
			steuer = wert - 50000;
			steuer = wert -(steuer*60/100) - 9000 - 3200 - 2000 - 1000; 		
			
		}
		else if (wert > 30000 
				&& wert <50000){
			steuer = wert - 30000;
			steuer = (wert -(steuer*45/100) -3200 - 2000 - 1000)/12;
			
		}
		else if (wert > 20000 
				&& wert <30000){
			//System.out.println("größer 20");
			steuer = wert - 20000;
			//System.out.println("minus 2000 "+steuer);
			steuer = (wert -(steuer*32/100) - 2000 - 1000)/12;
			
		}
		else if (wert > 20000 
				&& wert <30000){
			steuer = wert - 20000;
			steuer = (wert -(steuer*32/100) - 2000 - 1000)/12;
			
		}
		else if (wert > 10000 
				&& wert <20000){
			steuer = wert - 20000;
			steuer = (wert -(steuer*20/100)  - 1000)/12;
			
		}
		else if (wert < 10000){
			System.out.println("Unter 10000");
			steuer = wert;
			steuer = (wert -(steuer*10/100))/12;
			
		}
		
		
		wert = steuer;

		return wert;
	}
	
}
