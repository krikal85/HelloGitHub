package org.campusblackjackprüfung;

public class Player {
	private String name;
	private int age;
	
	public Player(String name, int age){
		this.name= name;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public String toString(){
		return " "+getName()+", Kartenwert:";
		
	}
	
	public void equals(){
		
	}
	
	public  int hashCode(){
		int hash=0;
		return hash;
		
	}
}
