package Employee;

public class FixCommissionEmployee extends Employee {
	
	protected double additionalComission;
	public FixCommissionEmployee(String lastname, String firstname, String department, double baseSalary,double additionalComission) {
		super(lastname, firstname, department, baseSalary);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getFullSalary(){
		double salary =0;
		salary = baseSalary + additionalComission;
		
		return salary;
		
	}

}
