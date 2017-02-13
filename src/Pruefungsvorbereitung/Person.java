package Pruefungsvorbereitung;

public class Person {
	private int id;
	private String vorname;
	private String nachname;
	private int koerpergroesse;
	private byte aktivitaetslevel;
	
	public Person(String vorname, String nachname, int koerpergroesse, byte aktivitaetslevel ){
		this.vorname = vorname;
		this.nachname=nachname;
		this.koerpergroesse = koerpergroesse;
		this.aktivitaetslevel = aktivitaetslevel;
	}

	public int getKoerpergroesse() {
		return koerpergroesse;
	}

	public void setKoerpergroesse(int koerpergroesse) {
		this.koerpergroesse = koerpergroesse;
	}

	public byte getAktivitaetslevel() {
		return aktivitaetslevel;
	}

	public void setAktivitaetslevel(byte aktivitaetslevel) {
		this.aktivitaetslevel = aktivitaetslevel;
	}

	public int getId() {
		return id;
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}
	
	public String rechneBMI(int gewicht){
		 double bmi = gewicht/((koerpergroesse/100.0)*(koerpergroesse/100.0));
		
		if(bmi < 18.5){
			return "Untergewicht";
		}
		else if(bmi >= 18.5 && bmi < 25){
			return "Normalgewicht";
		}
		else if(bmi >= 25 && bmi < 30){
			return "Übergewicht";
		}
		else 
			return "Adpositas";
	
		
	}
	
	public void printPerson(int gewicht){
		String level="";
		switch (aktivitaetslevel) {
		case 1:level="Couch Potatoe";
			break;
		case 2:level="Gelegenheitssportler";
			break;
		case 3:level="Sportler";
			break;	
		case 4:level="Profisportler";
			break;
		
		}
		System.out.println(vorname+" "+nachname+ ", " +level+", "+rechneBMI(gewicht));
	}
}

