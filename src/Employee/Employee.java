package Employee;

public class Employee {
	protected String lastname;
	protected String firstname;
	protected String department;
	protected double baseSalary;
	
	public Employee(String lastname,String firstname,String department,double baseSalary){
		this.lastname = lastname;
		this.firstname=firstname;
		this.department=department;
		this.baseSalary = baseSalary;
	}
	
	public double getFullSalary(){
		
		return baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public String getDepartment() {
		return department;
	}
}
