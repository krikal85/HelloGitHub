package LiveCoding;

public class organigramHandler {
	
	public static String getChainOfCommand(Employee employee){
		
		String chain = employee.getName()
							+"["+employee.getRole()+ "]";
		if(employee.getSuperior()== null){
			return chain;
		}
		else {
			
			return chain + "->" + getChainOfCommand(employee.getSuperior());
		}
		
	}
	
	public static String processHierarchy(Employee emp){
		String chain = emp.getName()
				+"["+emp.getRole()+ "]";
		emp.getSubordinates();
		if (emp.getSuperior()== null){
			return chain;
		}
		else {
			
			return chain + "->" + processHierarchy(emp.getSubordinates().get(0));
		}
	}
}
