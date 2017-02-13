package Pruefungsvorbereitung;

public class Verwaltungsstrafe {
	private String vorname;
	private String nachname;
	private String kennzeichen;
	private int strafnummer;
	private double strafe;
	private byte anzahl;
	
	public Verwaltungsstrafe(String vorname, String nachname, String kennzeichen){
		this.vorname=vorname;
		this.nachname = nachname;
		this.kennzeichen = kennzeichen;
	}

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
		if (getAnzahl()== 1){
			strafe = strafe - (strafe/100)*30;
			return strafe;
		}
		else if (getAnzahl()== 2){
			strafe = strafe - (strafe/100)*20;
			return strafe;
		}
		else if (getAnzahl()== 3){
			strafe = strafe - (strafe/100)*10;
			return strafe;
		}
		else
			return strafe;
	}

	public byte getAnzahl() {
		return anzahl;
	}
	
	public void strafe (int geschwindigkeitsueberschreitung){
		if (geschwindigkeitsueberschreitung < 20){
			strafe = strafe + 30;
			anzahl++;
		}
		else if(geschwindigkeitsueberschreitung>=20 && geschwindigkeitsueberschreitung<30){
			strafe = strafe + 50;
			anzahl++;
		}
		else if(geschwindigkeitsueberschreitung>=30 && geschwindigkeitsueberschreitung<50){
			strafe = strafe +100;
			anzahl++;
		}
		else if(geschwindigkeitsueberschreitung>=50 && geschwindigkeitsueberschreitung<100){
			strafe = strafe +500;
			anzahl++;
		}
		else if(geschwindigkeitsueberschreitung>=100){
			strafe = strafe +1500;
			anzahl++;
		}
	}
	
	public void verbandskasten(){
		strafe = strafe +25;
		anzahl++;
	}
	
	public void alkohol(double wert){
		if (wert >=0.5 && wert< 1.0 ){
			strafe = strafe +100;
			anzahl++;
			anzahl++;
		}
		else
			System.out.println("Keine Strafe");
	}
	
	public void sonstige(double wert){
		strafe = strafe +wert;
		anzahl++;
	}
	
}
