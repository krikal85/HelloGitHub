package Programmieren2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoPersonComp {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person(1321,"Viktoria"));
				people.add(new Person(2234,"Eli"));
		
		//Collections.sort(people,new NameDesc());		
		//Collections.sort(people,new PersonDesc());
		Collections.sort(people,new PersonComp());
				
		for (Person p : people) {
			System.out.println(p);
		}

	}

}
