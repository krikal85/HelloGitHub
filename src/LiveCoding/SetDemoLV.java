package LiveCoding;

import java.util.HashSet;

public class SetDemoLV {

	public static void main(String[] args) {
		HashSet<String> setA = new HashSet<>();
		setA.add("Viki");
		setA.add("Hannes");
		setA.add("Andi");
		
		HashSet<String> setB = new HashSet<>();
		setB.add("Viktoria");
		setB.add("Hannes");
		setB.add("Andreas");
		setB.add("Angelika");
		setB.add("Andi");
		
		//Kopie von A Erstellen weil alle anderen herausgelöscht werden
		HashSet<String> temp = new HashSet<>(setA);
		temp.retainAll(setB);
		//zumindest 2 Namen überlappen
		System.out.println(temp);
		
		//alle in B ohne A --> difference
		HashSet<String> tempDiff = new HashSet<>(setB);
		tempDiff.removeAll(setA);
		System.out.println(tempDiff);
		
		//union --> addAll
		HashSet<String> tempAdd = new HashSet<>(setA);
		tempAdd.addAll(setB);
		System.out.println(tempAdd);
		
		Person2 p1 = new Person2("Viki","Schlaipfer");
		Person2 p2 = new Person2("Andi","Kapfer");
		HashSet<Person2> persons = new HashSet<>();
		persons.add(p1);
		persons.add(p2);
		
		System.out.println(persons);
		
	}

}
