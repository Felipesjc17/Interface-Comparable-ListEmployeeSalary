package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		List<Employee> listEmployee = new ArrayList<>();
		
		String path = "C:\\temp\\employee.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String employeeCsv = br.readLine();
			
			while(employeeCsv != null) {
				String[]fieldes = employeeCsv.split(",");
				listEmployee.add(new Employee(fieldes[0], Double.parseDouble(fieldes[1])));
							
				employeeCsv = br.readLine();
				}
			
			
			Collections.sort(listEmployee);
			
			for(Employee emp : listEmployee) {
				System.out.println(emp.getName()+ ", "+ emp.getSalary());
			}
			
		}catch(IOException e){
			System.out.println("Error: "+ e.getMessage());
			
		}
		
		
	}

}
