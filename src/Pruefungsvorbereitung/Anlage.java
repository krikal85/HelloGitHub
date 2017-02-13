package Pruefungsvorbereitung;

public class Anlage {
	private String Bezeichnung;
	private double initialWert;
	private int nutzungsdauer;
	private double RestWert;
	private int alter;
	
	public Anlage (String Bezeichnung,double initialWert, int nutzungsdauer){
		this.Bezeichnung = Bezeichnung;
		this.initialWert = initialWert;
		this.nutzungsdauer = nutzungsdauer;
		RestWert = initialWert;
				
	}

	public String getBezeichnung() {
		return Bezeichnung;
	}

	public double getInitialWert() {
		return initialWert;
	}

	public int getNutzungsdauer() {
		return nutzungsdauer;
	}
	
	
	public void abschreiben(){
		alter++;
		if(alter <= nutzungsdauer){
			RestWert= Math.floor(initialWert/nutzungsdauer*(nutzungsdauer-alter));
		}
	}
	
	public void simulate (int maxJahre, int minWert){
		System.out.println("Restwert vor Abschreiben: "+RestWert);
		
		for(int i=1; i<=maxJahre; i++){
			if(RestWert!=0 && RestWert>=minWert){
			abschreiben();
			System.out.println("----------"+i);
			System.out.println("Restwert nach Abschreiben: "+RestWert);
			}
			
		}
	}
	
	public Anlage renew (int zusatzWert, int zusatzJahre){
		initialWert= RestWert+zusatzWert;
		//System.out.println(initialWert);
		nutzungsdauer = (nutzungsdauer-alter)+zusatzJahre;
		Bezeichnung = "Hallo";
		//System.out.println(nutzungsdauer);
		return new Anlage(getBezeichnung(), initialWert, nutzungsdauer);
	}
		
	
}
