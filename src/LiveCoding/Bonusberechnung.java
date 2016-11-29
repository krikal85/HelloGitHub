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
		return gehalt;
	}

	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
		gehalt = (gehalt *12);
		gehalt = gehalt-(gehalt*(20/100));
		
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
		return getGehalt();
		
	}
	
}
