package Pruefungsvorbereitung;



public class DemoEmployee {
	public static void main(String[] args) {
		Employee viki = new Employee("Viki","S", "IT", 100);
		System.out.println(viki.getFullSalary());
		
		Employee eli = new Employee("eli","K", "IT", 1000);
		System.out.println(eli.getFullSalary());
		
		FixCommissionEmployee tarzan = new FixCommissionEmployee("Tarzan","M", "HR", 2200);
		tarzan.setAdditionalCommission(200);
		System.out.println(tarzan.getFullSalary());
		
		PercentComissionEmpoyee jane = new PercentComissionEmpoyee("Jane", "N", "QM", 100);
		jane.setPercentComission(20);
		System.out.println(jane.getFullSalary());
		
		EmployeeManager manager = new EmployeeManager();
		manager.addEmployee(viki);
		manager.addEmployee(tarzan);
		manager.addEmployee(jane);
		manager.addEmployee(eli);
		
		System.out.println("Gesamte Summe: "+manager.calcTotalSalary());
		System.out.println(manager.getSalaryByDepartment());
		
	
	}
}
