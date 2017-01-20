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
	//	String chain = emp.getName()
		//		+"["+emp.getRole()+ "]";
		//emp.getSubordinates();
		if (emp.getSubordinates().isEmpty()){
			return "-"+emp.getRole()+"{"+emp.getName()+"}\n";
		}
		
		String ausgabe = "+"+emp.getRole()+"{"+emp.getName()+"}\n";
		
		for(Employee e :emp.getSubordinates()){
			
			ausgabe = ausgabe + processHierarchy(e);
		}
		return ausgabe;
	}
}
