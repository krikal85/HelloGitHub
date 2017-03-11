package Programmieren2;

public class Person implements Comparable <Person>{
	public int id;
	public String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Person o){
		
		if(this.id < o.id){
			return -1;
		}
		if(this.id > o.id)
			return 1;
		return 0;
	}
	
	
	
	

}
