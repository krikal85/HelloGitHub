package LiveCoding;

public class DemoEmp {

	public static void main(String[] args) {
		Employeemanager manager = new Employeemanager();
		Employee Employee1 = new Employee(1, "Viktoria", 200, "IT");
		
		manager.addEmployees(Employee1);
		System.out.println(manager.findByDepartment("IT"));
		

	}

}
