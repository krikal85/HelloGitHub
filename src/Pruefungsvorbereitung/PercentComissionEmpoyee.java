package Pruefungsvorbereitung;

public class PercentComissionEmpoyee extends Employee {

	protected double percentComission;
	public PercentComissionEmpoyee(String lastname, String firstname, String departement, double baseSalary) {
		super(lastname, firstname, departement, baseSalary);
		// TODO Auto-generated constructor stub
	}
	
	public double getFullSalary(){
		double salary = baseSalary+getPercentComission();
		return salary;
	}

	public double getPercentComission() {
		
		return percentComission;
	}

	public void setPercentComission(double percentComission) {
		this.percentComission = (baseSalary/100)*percentComission;
	}

}
