package Pruefungsvorbereitung;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeManager {
	private ArrayList<Employee> employees= new ArrayList<>();
	

	public double calcTotalSalary(){
		double wholeSalary = 0;
		for (Employee employee : employees) {
			
			wholeSalary = wholeSalary+ employee.getFullSalary();
			
		}
		return wholeSalary;
	}
	
	public void addEmployee(Employee emp){
		employees.add(emp);
	}
	
	public HashMap<String,Double> getSalaryByDepartment(){
		HashMap<String, Double> salary = new HashMap<>();
		for (Employee employee : employees) {
			
			if(salary.containsKey(employee.getDepartment())){
				//ich hole mir aus der HashMap über den KEy (departement meinen Value (salary)
				double currentSalary = salary.get(employee.getDepartment());
				currentSalary = currentSalary + employee.getFullSalary();
				
				salary.put(employee.getDepartment(), currentSalary);
			}
			else {
				System.out.println("Else");
				salary.put(employee.getDepartment(),employee.getFullSalary());
			}
		}
		return salary;
		
	}
	
}
