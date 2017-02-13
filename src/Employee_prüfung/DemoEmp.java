package Employee_prüfung;

public class DemoEmp {

	public static void main(String[] args) {
		Employeemanager em = new Employeemanager();
		
		//create employees and build hierarchy
		//according to organigram
		Employee ceo = new Employee(1, "Mitarbeiter 1", 7_500, "Management", "CEO");
		
		Employee cto = new Employee(2, "Mitarbeiter 2", 6_500, "Management", "CTO");
		cto.setSuperior(ceo);
		ceo.add(cto);
		
		Employee dev1 = new Employee(3, "Mitarbeiter 3", 3_500, "Engineering", "Dev");
		dev1.setSuperior(cto);
		Employee dev2 = new Employee(4, "Mitarbeiter 4", 3_500, "Engineering", "Dev");
		dev2.setSuperior(cto);
		
		cto.add(dev1);
		cto.add(dev2);
		
		Employee hr = new Employee(5, "Mitarbeiter 5", 6_500, "Management", "HR");
		hr.setSuperior(ceo);
		ceo.add(hr);
			
		//register all employees
		em.addEmployees(ceo);
		em.addEmployees(cto);
		em.addEmployees(hr);
		em.addEmployees(dev1);
		em.addEmployees(dev2);
		
	//	System.out.println(OrganigrammHandler.getChainOfCommand(ceo));
	//	System.out.println(OrganigrammHandler.processHierarchy(ceo));
		System.out.println(OrganigrammHandler.processHierarchy(ceo,""));
				
		
	}


	
}
