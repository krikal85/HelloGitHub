package Employee;

public class Demo {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Viki","S","IT", 2580);
		Employee emp2 = new Employee("Eli","K","I", 3000);
		Employee emp3 = new Employee("Eli","K","I", 3000);
		EmployeeManager manager = new EmployeeManager();
		manager.addEmployee(emp1);
		manager.addEmployee(emp2);
		manager.addEmployee(emp3);
		System.out.println(manager.calcTotalSalary());
		
		System.out.println(manager.getSalaryByDepartment());
	}

}
