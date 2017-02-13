package Pruefungsvorbereitung;



public class Rezept {
	private String Name;
	private byte Person;
	
	private Zutat[] Zutaten;
	
	public Rezept (String Name,byte Person, Zutat[] Zutaten){
		this.Name=Name;
		this.Person=Person;
		this.Zutaten=Zutaten;
		
	}

	public String getName() {
		return Name;
	}

	public byte getPerson() {
		return Person;
	}

	public Zutat[] getZutaten() {
		return Zutaten;
	}
	
	public void printRezept(){
		System.out.println("Rezept: "+getName());
		for (int i = 0; i < Zutaten.length; i++) {
			System.out.println(Zutaten[i].getName()+" - "+Zutaten[i].getMerge());
		}
	}
	
	public Rezept umrechnen(int personen){
		
		Zutat[] zutat_neu = new Zutat[Zutaten.length];
		int faktor = personen/this.Person;
		
		for (int i = 0; i < Zutaten.length; i++) {
			
			//zutat_neu[i].Merge = 4;
			zutat_neu[i] = new Zutat(
					Zutaten[i].getName(),
					Zutaten[i].getMerge() *faktor
					);
		}
		
		return new Rezept(this.Name, Person, zutat_neu);
	}
}
