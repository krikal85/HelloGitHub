package Programmieren2;

import java.io.Serializable;

public class Person2 implements Serializable{
	private String vorname;
	private String nachname;
	public Person2(String vorname, String nachname) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	@Override
	public String toString() {
		return vorname+" "+nachname;
	}
	
	
	
}
