package Pruefungsvorbereitung;

public class Employee {
	protected String lastname;
	protected String firstname;
	protected String department;
	protected double baseSalary;
	
	public Employee(String lastname,String firstname,String departement,double baseSalary ){
		this.lastname=lastname;
		this.firstname = firstname;
		this.department = departement;
		this.baseSalary=baseSalary;
	}
	
	public double getFullSalary(){
		double salary = baseSalary;
		return salary;
	}

	public String getDepartment() {
		return department;
	}
	
	
	
}
