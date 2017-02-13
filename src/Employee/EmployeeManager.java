package Employee;

import java.util.ArrayList;
import java.util.HashMap;


public class EmployeeManager {
	
	ArrayList<Employee> employees = new ArrayList<>();
	
	public double calcTotalSalary(){
		double total=0;
		for (Employee employee : employees) {
			total = total + employee.getFullSalary();
			
		}
		return total;
	}
	
	public void addEmployee(Employee e){
		employees.add(e);
	}
	
	public HashMap<String, Double> getSalaryByDepartment(){
		HashMap<String,Double> map = new HashMap<>();
		double salary =0;
		for (Employee employee : employees) {
			if(map.containsKey(employee.getDepartment())){
				salary = map.get(employee.getDepartment());
				salary += employee.getFullSalary();
				map.put(employee.getDepartment(),salary);
			}
			else{
				 map.put(employee.getDepartment(),employee.getFullSalary());
			}
		}
		printManager(map);
		return map;
	}
	
	public void printManager(HashMap<String, Double> map){
		System.out.println(map);
	}
}
