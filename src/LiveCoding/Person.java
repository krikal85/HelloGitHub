package LiveCoding;

public class Person {
	public String name;
	public String surname;
	public int age;
	public String haircolour;
	public Address address;
	
	public void setAddress (String city, String street, int zip){
		address = new Address();
		address.City = city;
		address.Zip = zip;
		address.Street = street;
	}
	

	

}
