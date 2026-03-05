package oops;

//Example of Encapsulation in Java
class Employee {
	// Private variables - cannot be accessed directly
	private int empId;
	private String name;
	private double salary;

	// Getter for empId
	public int getEmpId() {
		return empId;
	}

	// Setter for empId
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	// Getter for name
	public String getName() {
		return name;
	}

	// Setter for name
	public void setName(String name) {
		this.name = name;
	}

	// Getter for salary
	public double getSalary() {
		return salary;
	}

	// Setter for salary
	public void setSalary(double salary) {
		// Optional: add validation
		if (salary > 0) {
			this.salary = salary;
		} else {
			System.out.println("Invalid salary!");
		}
	}
}

public class EncapsulationMain {
	public static void main(String[] args) {
		Employee emp = new Employee();

		// Setting values using setters
		emp.setEmpId(101);
		emp.setName("Mahesh Devre");
		emp.setSalary(50000);

		// Getting values using getters
		System.out.println("Employee ID: " + emp.getEmpId());
		System.out.println("Employee Name: " + emp.getName());
		System.out.println("Employee Salary: " + emp.getSalary());
	}

}
