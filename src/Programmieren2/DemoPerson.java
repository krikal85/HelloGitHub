package Programmieren2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DemoPerson {
	public static void main(String[] args) {
		Person[] person = {
				new Person(4321,"Viktoria"),
				new Person(1234,"Eli")	
		};
		
		Arrays.sort(person);
		System.out.println(Arrays.toString(person));
		
		
		List<Person> people = new ArrayList<>();
		people.add(new Person(4321,"Viktoria"));
				people.add(new Person(1234,"Eli"));
				Collections.sort(people);
				
		for (Person p : people) {
			System.out.println(p);
		}
		
	}
}
