package generics;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Profil {
	private String vorname;
	private String nachname;
	private String email;
	private MayBeInt alter;
	private MayBeInt gehalt;
	private MayBe<String> beziehungsstatus;
	private MayBe<GregorianCalendar> birthdate;
	
	public Profil(String vorname,String nachname,String email, MayBeInt alter, MayBeInt gehalt,MayBe<String> beziehungsstatus,MayBe<GregorianCalendar> birthdate){
		this.vorname = vorname;
		this.nachname = nachname;
		this.email = email;
		this.alter = alter;
		this.gehalt = gehalt;
		this.beziehungsstatus = beziehungsstatus;
		this.birthdate = birthdate;
		
		
		
	}
	
	



	public void print(){
		System.out.println("Vorname: "+vorname+ "\nNachname: "+nachname+" ");
		System.out.print("Alter: ");
		alter.print();
		System.out.print("Gehalt: ");
		gehalt.print();
		System.out.print("Beziehungsstatus: ");
		beziehungsstatus.print();
		System.out.print("Gebursdatum: ");
		birthdate.print();
		
	}

}
