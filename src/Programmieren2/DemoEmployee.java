package Programmieren2;

import java.util.Arrays;

public class DemoEmployee {

	public static void main(String[] args) {
		Employee[] employees ={
				new Employee(323, "Viktoria", 1000, "IT"),
				new Employee(122, "Eli", 3000, "IT"),
				new Employee(322, "Chris", 30000, "IT"),
				
		};
		
		Arrays.sort(employees);
		for (Employee employee : employees) {
			System.out.println(employee);
		}

	}

}
