package LiveCoding;

public class MaxMutermann {

	public static void main(String[] args) {
		String [] personDef= {"Mustermann", "Max", "35"};
		String [] personDef2= {"Müller", "Hans", "22"};

		//call Method, change String to itn
		createPerson(personDef[0],personDef[1],Integer.parseInt(personDef[2]));
		createPerson(personDef2[0],personDef2[1],Integer.parseInt(personDef2[2]));
	}
	
	public static void createPerson(String name, String surname,int age){
		Person person = new Person();
		person.name= name;
		person.surname=surname;
		person.age = age;
		person.setAddress("Graz","Auwaldgasse",8041);
		print(person.name,person.surname,person.age);
		
		
		
		
	}
	//Output Handler
	public static void print(String parameter1,String parameter2,int number){
		System.out.println(parameter1+" "+parameter2+" "+number);
	}
	

}
