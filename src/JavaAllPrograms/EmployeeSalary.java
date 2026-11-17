package JavaAllPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//Important Query
////Delete duplicate record and keep one
//To retrieve employees whose salary is greater than the average salary of their own department
//Employees with Highest Salary in Each Department
//Find Employees with Same Salary
//find all the manager email id
//Write an SQL query to get the latest record per group.
class Employee{
	private  int id;
	private String name;
	private double salary;
	
	public Employee( int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}

public class EmployeeSalary {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee(1, "John", 4000),
				                           new Employee(2,"Tom", 3000),
				                           new Employee(3, "Harry", 2000),
				                           new Employee(3, "Rohan", 3000));
		
		//Find salary is above 2000
	
		//Sort the employee in asending and descending order
		
		//sort the name in ascending and salary in descending order
		list.sort(Comparator.comparing(Employee::getName)
				.thenComparing(Comparator.comparing(Employee::getSalary).reversed()));
		
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		//Find salary is above 2000
		//list.stream().filter(i->i.getSalary()>2000).forEach(System.out::println);
		
		//Sort the employee in asending and descending order
		//list.sort(Comparator.comparing(Employee::getName).reversed());
	//	System.out.println(list);
		
		//sort the name in ascending and salary in descending order
		//list.sort(Comparator.comparing(Employee::getName).thenComparing(Comparator.comparing(Employee::getSalary).reversed()));
		
//		
//		list.sort(
//			    Comparator.comparing(Employee::getName) // name ASC
//			              .thenComparing(Comparator.comparing(Employee::getSalary).reversed()) // salary DESC
//			);
	}

}
