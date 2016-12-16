package LiveCoding;

public class Employee {
	private int	empNumber;
	private String	name;
	private double salary;
	private String department;
	
	public Employee(int empNumber, String name, double salary, String department){
		this.empNumber = empNumber;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Employee [getSalary()=" + getSalary() + ", getDepartment()=" + getDepartment() + ", getEmpNumber()="
				+ getEmpNumber() + ", getName()=" + getName() + "]";
	}

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getEmpNumber() {
		return empNumber;
	}
	public String getName() {
		return name;
	}
	
	
}
