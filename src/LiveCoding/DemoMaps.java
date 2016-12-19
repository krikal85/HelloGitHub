package LiveCoding;

import java.util.HashMap;
import java.util.Map;

public class DemoMaps {

	public static void main(String[] args) {
		
		Map<String, Integer> myMap = new HashMap<>();
		//add a few 
		myMap.put("Voitsberg", 51691);
		myMap.put("Graz", 2738383);
		myMap.put("Deutschlandsberg", 601102);
		
		//read back
		Integer ewGraz = myMap.get("Graz");
		System.out.println("Bezirk Graz: "+ewGraz);

	}

}
