package entities;

public class Employee implements Comparable<Employee>{
	private String name;
	private Double salary;
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Employee other) {
		//return name.compareTo(other.getName()); //ordem alfab�tica
		//return salary.compareTo(other.getSalary()); // menor para o maior
		return -salary.compareTo(other.getSalary()); // maior para menor
	}

}
