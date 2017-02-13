package Pruefungsvorbereitung;

public class Animal {
	private String color;
	private int countEyes;
	
	public Animal(String color, int countEyes){
		this.color= color;
		this.countEyes = countEyes;
	}
	
	public String getColor() {
		return color;
	}

	public int getCountEyes() {
		return countEyes;
	}

	public void walk(){
		System.out.println("Das Tier geht");
	}
	
	public void makeNoise(){
		System.out.println("Das Tier macht Geräusche");
	}
}
