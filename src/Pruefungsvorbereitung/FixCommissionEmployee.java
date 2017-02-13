package Pruefungsvorbereitung;

public class FixCommissionEmployee extends Employee {

	protected double additionalCommission;
	
	public FixCommissionEmployee(String lastname, String firstname, String departement, double baseSalary) {
		super(lastname, firstname, departement, baseSalary);
		// TODO Auto-generated constructor stub
	}
	
	public double getFullSalary(){
		double salary = baseSalary+getAdditionalCommission();
		return salary;
	}

	public double getAdditionalCommission() {
		return additionalCommission;
	}

	public void setAdditionalCommission(double additionalCommission) {
		this.additionalCommission = additionalCommission;
	}
	
	

	
}
