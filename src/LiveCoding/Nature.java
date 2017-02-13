package LiveCoding;

import java.util.ArrayList;
import java.util.HashMap;

public class Nature {

	private ArrayList<animal> animals = new ArrayList<>();
	
	
	
	public void addAnimal(animal a){
		animals.add(a);
		
	}
	
	public int countColour(String color){
		int count= 0;
		for (animal animal : animals) {
			if(animal.getcolor()==color){
				count++;
			}
		}
		return count;
	}
	
	public HashMap<String,Integer> getCountByColor () {
		HashMap<String,Integer> colors = new HashMap<>();
		
		
		
		for (animal animal : animals) {
			if(colors.containsKey(animal.getcolor())){
				int currentCount = colors.get(animal.getcolor());
				currentCount++;
				colors.put(animal.getcolor(),currentCount);
			}
			else{
				colors.put(animal.getcolor(),1);
			}
		}
		
		return colors;
	}
	
}
