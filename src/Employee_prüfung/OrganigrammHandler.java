package Employee_prüfung;

import java.util.ArrayList;

public class OrganigrammHandler {
	
	public static String getChainOfCommand(Employee employee){
		String chain = "";
		if(employee.getSuperior()==null){
			return employee.getName()+"[ "+employee.getDepartment()+"]";
		}
		else{
			chain = chain +employee.getName()+" -->";
			return chain+getChainOfCommand(employee.getSuperior());
		}
	}
	
	
	public static String processHierarchy(Employee emp){
		String hierarchy ="";
		ArrayList<Employee> employees = emp.getSubordinates();
		if(employees.isEmpty()){
			return "-"+emp.getName()+"\n";
		}
		else{
			hierarchy = "+"+emp.getName()+"\n"; 
			for (Employee employee : employees) {
				hierarchy += processHierarchy(employee);
			}
		}	
		return hierarchy;
	}
	
	public static String processHierarchy(Employee emp, String indent){
		String hierarchy ="";
		ArrayList<Employee> employees = emp.getSubordinates();
		if(employees.isEmpty()){
			return indent+"-"+emp.getName()+"\n";
		}
		else{
			hierarchy = indent+"+"+emp.getName()+"\n"; 
			indent +="  ";
			for (Employee employee : employees) {
			
				hierarchy += processHierarchy(employee,indent);
			}
		}	
		return hierarchy;
	}
}