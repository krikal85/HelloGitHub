package LiveCoding;

public class DemoEmp {

	public static void main(String[] args) {
		Employeemanager manager = new Employeemanager();
		Employee Employee1 = new Employee(1, "Viktoria", 200, "IT");
		
		manager.addEmployees(Employee1);
		//System.out.println(manager.findByDepartment("IT"));
		
		Employee employee2 = new Employee(2, "Max Mustermann", 100, "IT", "CIO", null);
		Employee employee3 = new Employee(3, "Susi Sorglos", 300, "IT", "CTO", employee2);
		Employee employee4 = new Employee(4, "Susi Sorglos", 300, "IT", "HR",employee3);
		employee2.add(employee2);
		employee2.add(employee4);
		
		organigramHandler organigram = new organigramHandler();
		System.out.println(organigram.getChainOfCommand(employee4));
		
		
		
		
	}

}
