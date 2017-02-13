package Employee_prüfung;

import java.util.ArrayList;

public class Employeemanager {
	
	ArrayList<Employee> employees = new ArrayList<>();
	
	
	public void addEmployees(Employee e){
		employees.add(e);
	}
	
	public Employee findByMaxSalary(){
		double max = 0.0;
		Employee found = null;
		for (Employee e : employees){
			if(e.getSalary() > max){
				max= e.getSalary();
				found = e;
			}
		}
		
		return found;
	}
	
	public Employee findByEmployeeNumber(int numbers){
		for (Employee e : employees){
			if (e.getEmpNumber()== numbers){
				return e;
			}
	
		}
		return null;
	}
	
	public ArrayList<Employee> findByDepartment(String department){
		ArrayList<Employee> found = new ArrayList<>();
		for(Employee e : employees){
			if (department.equals(e.getDepartment())){
				found.add(e);
			}
		}
		return found;
		
		
	}
	
	public ArrayList<Employee> returnList(){
		return employees;
	}
}
