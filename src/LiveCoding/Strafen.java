package LiveCoding;

public class Strafen {
	private String vorname;
	
	private String nachname;
	private String kennzeichen;
	private int strafnummer;
	private double strafe;
	private byte anzahl;
	
	//Konstruktor
	public Strafen(String vorname,String nachname, String kennzeichen){
		this.vorname = vorname;
		this.nachname = nachname;
		this.kennzeichen = kennzeichen;
	}
	//Getter
	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public String getKennzeichen() {
		return kennzeichen;
	}

	public int getStrafnummer() {
		return strafnummer;
	}

	public double getStrafe() {
		System.out.println("anzahl: "+getAnzahl());
		if (getStrafnummer() == 1){
			strafe -= (strafe*30)/100 ;
		}
		else if (getStrafnummer() == 2){
			strafe -= (strafe*20)/100 ;
					}
		else if (getStrafnummer() == 3){
			strafe -= (strafe*10)/100 ;
		}
		else if (getStrafnummer() >= 4){
			System.out.println("Keiner Vergünstigung da zuviele Strafen: "+getStrafnummer());
		}
				
		return strafe;
	}

	public byte getAnzahl() {
		return anzahl;
	}

	public void strafe(int geschwindigkeitsueberschreitung){
		
		if(!validate(geschwindigkeitsueberschreitung))
			return;
		else{
			if(geschwindigkeitsueberschreitung <= 20)
				strafe = strafe + 30;
				
			else if (geschwindigkeitsueberschreitung > 20 && geschwindigkeitsueberschreitung <= 30)
				strafe = strafe + 50;
			else if (geschwindigkeitsueberschreitung > 30 && geschwindigkeitsueberschreitung <= 50)
				strafe = 100;
			else if (geschwindigkeitsueberschreitung > 50 && geschwindigkeitsueberschreitung<= 100)
				strafe = strafe + 500;
			else
				strafe = strafe + 1500;
			anzahl ++;
			strafnummer ++;
		}
	}
	
	public void verbandspaket(){
		strafe += 25;
		anzahl ++;
		strafnummer ++;
	}

	public void alkohol(double wert){
		if (wert < 0.5)
			return;
		else if(wert >= 0.5 && wert <= 1.0)
			strafe += 100;
			
		else if (wert > 1.0 && wert <= 2.0)
			strafe += 400;
		else if (wert > 2.0 && wert <= 3.0)
			strafe += 1000;
		else 
			strafe += 5000;
		anzahl +=2;
		strafnummer ++;
	}
	
	public void sonstiges(double wert){
		strafe +=wert;
		anzahl ++;
		strafnummer ++;
	}
	
	private boolean validate (int wert){
		if(wert > 0)
			return true;
		else
			return false;
	}
	
	

}
