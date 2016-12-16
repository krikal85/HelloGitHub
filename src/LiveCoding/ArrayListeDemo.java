package LiveCoding;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListeDemo {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		names.add("John");
		names.add("Mary");
		names.add("Fill");
		
		System.out.println("size? : "+names.size());
		System.out.println("contains Peter "+names.contains("Peter"));
		System.out.println("contains Mary "+names.contains("Mary"));
		//for each Schleife 
		for(String name : names){
			System.out.print(name+ ", ");
			
		}
		System.out.println();
		//Name mit Indexzugriff
		System.out.println("name 2= "+names.get(1));
		//Iterator
		Iterator<String> it = names.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
