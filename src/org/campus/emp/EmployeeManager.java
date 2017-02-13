package org.campus.emp;

import java.util.ArrayList;

import com.sun.xml.internal.ws.transport.http.DeploymentDescriptorParser;



public class EmployeeManager {
	
	private ArrayList<Employee> employees = new ArrayList<>();
	
	public void addEmployee(Employee e){
		employees.add(e);
	}
	
	public Employee findByMaxSalary(){
		double max = 0;
		Employee emp = null;
		
		for (Employee employee : employees) {
			employee.getSalary();
			if (max < employee.getSalary()){
				max = employee.getSalary();
				emp = employee;
			}	
				
				
		}
		System.out.println(emp);
		return emp;
		
		
	}
	
	public Employee	findByEmpNumber(int	number){
		for (Employee employee : employees) {
			if (employee.getEmpNumber()== number){
				return employee;
			}
			
		}
		return null;
	}
	
	public ArrayList<Employee>	findByDepartment(String	department){
		ArrayList<Employee> emp = new ArrayList<>();
		
		for (Employee employee : employees) {
			if(department.equals(employee.getDepartment())){
				emp.add(employee);	
			}
		}
		return emp;
	}
	
}
