package org.campus02.oop;

import java.util.ArrayList;
import java.util.HashMap;

public class Bundesstaat {
	private ArrayList<Einwohner> einwohners = new ArrayList<>();
	
	public void add(Einwohner e){
		einwohners.add(e);
	}
	
	public double gesamteSteuer(){
		double steuer =0;
		for (Einwohner einwohner : einwohners) {
			steuer +=einwohner.steuer();
		}
				
		return steuer;
	}
	
	public HashMap<String,Double> steuerNachBundesland(){
		HashMap<String,Double> map = new HashMap<>();
		double steuer =0;
		for (Einwohner einwohner : einwohners) {
			if(map.containsKey(einwohner.getBundesland())){
				steuer = map.get(einwohner.getBundesland());
				steuer += einwohner.steuer();
				map.put(einwohner.getBundesland(), steuer);
			}
			else
				map.put(einwohner.getBundesland(), einwohner.steuer());
		}
		
		return map;
	}
}
