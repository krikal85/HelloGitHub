package Programmieren2;

import java.util.Comparator;

public class NameDesc implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		
		return o2.getName().compareTo(o1.getName());
	}

	
}
