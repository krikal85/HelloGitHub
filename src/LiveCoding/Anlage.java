package LiveCoding;

public class Anlage {
	private String bezeichnung;
	private double initialWert;
	private int nutzungsdauer;
	private double restWert;
	private int alter;
	//Konstruktor
	public Anlage(String bezeichnung, double initialWert, int nutzungsdauer){
		this.bezeichnung = bezeichnung;
		this.initialWert = initialWert;
		this.nutzungsdauer = nutzungsdauer;
		
		restWert = initialWert;
		alter =0;
	}
	//Getter
	public String getBezeichnung() {
		return bezeichnung;
	}

	public double getInitialWert() {
		return initialWert;
	}

	public int getNutzungsdauer() {
		return nutzungsdauer;
	}

	public double getRestWert() {
		return restWert;
	}

	public int getAlter() {
		return alter;
	}
	
	//Methoden
	public void abschreiben(){
		alter++;
		if (alter <= nutzungsdauer){
			restWert =  Math.floor(initialWert / nutzungsdauer * (nutzungsdauer - alter));
		}
		else
			System.out.println("Nutzungsdauer kleiner als Anlagenwert - Anlage kann nicht mehr abgeschrieben werden!");;
	}
	
	public void simulate(int maxJahre, int minWert){
		for (int i = 1; i <= maxJahre; i++ ){
			abschreiben();
			System.out.println("i"+i+" rest Wert "+restWert);
			if(restWert == 0){
				System.out.println("Rest Wert = 0");
				break;
			}
			else if (restWert < minWert){
				System.out.println("Rest Wert kleiner Min Wert"+restWert);
				break;		
			}
		}
		
	}
	
	public Anlage renew(int zusatzWert, int zusatzJahre){
		
		this.restWert = this.restWert + zusatzWert;
		this.nutzungsdauer = ((nutzungsdauer-alter)+zusatzJahre);
		
		Anlage neueAnlage = new Anlage(bezeichnung, restWert,nutzungsdauer);
		return neueAnlage;
	}
	
	public void printAnlage(Anlage anlage){
		System.out.println(anlage.getBezeichnung()+", "+anlage.getRestWert()+", "+anlage.getNutzungsdauer());
	}
}
