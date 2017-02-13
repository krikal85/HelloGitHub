package Pruefungsvorbereitung;

public class Zutat {
	
	private String Name;
	int Merge;
	
	public Zutat(String Name,int Merge){
		this.Name = Name;
		this.Merge=Merge;
	}

	public String getName() {
		return Name;
	}

	public int getMerge() {
		return Merge;
	}
	
}
