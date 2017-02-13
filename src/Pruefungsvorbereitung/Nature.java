package Pruefungsvorbereitung;

import java.util.ArrayList;
import java.util.HashMap;

public class Nature {
	ArrayList<Animal> animals = new ArrayList<>();
	
	public void addAnimal(Animal a){
		animals.add(a);
	}
	
	public int countColor(String color){
		int count = 0;
		String color2;
		for (Animal animal : animals) {
			color2= animal.getColor();
			if(color2.equals(color)){
				count++;
			}
		}
		return count;
	}
	
	public HashMap<String,Integer> getCountByColor () {
		HashMap<String,Integer> map = new HashMap<>();
		 int count;
		 for (Animal animal : animals) {
			if(map.containsKey(animal.getColor())){
				count = map.get(animal.getColor());
				count++;
				map.put(animal.getColor(), count);
				
			}
			else
				map.put(animal.getColor(),1);
			
		}
		return map;
	}
	
}
