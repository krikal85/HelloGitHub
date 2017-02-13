package org.campus.emp;

public class Demo {

	public static void main(String[] args) {
		Employee viki = new Employee(12,"Viki",4500,"IT");
		Employee eli = new Employee(13,"Eli",3500,"IT");
		EmployeeManager manager = new EmployeeManager();
		
		manager.addEmployee(viki);
		manager.addEmployee(eli);
		manager.findByMaxSalary();
		
		manager.findByEmpNumber(12);
		System.out.println(manager.findByDepartment("IT"));
	}

}
