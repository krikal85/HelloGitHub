package Pruefungsvorbereitung;

import java.util.ArrayList;

public class Ort {
	private String name;
	private ArrayList<Ort> nachbar = new ArrayList<>();
	
	public Ort(String name){
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void addNachbar(Ort o){
		nachbar.add(o);
	}
	
	public boolean hasCircle()
	{
		return hasCircle("", name);
	}
	
	private boolean hasCircle(String ueber, String ziel)
	{
		for (Ort ort : nachbar) 
		{
			System.out.println(ort.getName());
			//Abbruchbedingung 1
			//Wenn der Startort gleich dem uebergeordneten Knoten
			if(ort.name.equals(ueber))
				//bricht ab und geht mit nächstem Schritt weiter
				continue;
			//Abbruchbedingung 2
			//Wenn Startort gleich dem Ziel
			if(ort.name.equals(ziel))
				return true;
			
			//Zwischenvariable
			boolean erg = ort.hasCircle(name, ziel);
			
			//Abbruchbedingung 3
			if(erg)
				return true;		
		}
		
		return false;
		
	}
	
	
	public int countHops(Ort o, Ort d)
	{
		for (Ort ort : nachbar) 
		{
			ort.name.equals(o);
			if(o!=d){
			return +1;
			}
			else 
				return +0;
		}
		return +0;

	}
	
}
