//package java8Program;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//class Employee {
//    private int id;
//    private String name;
//    private double salary;
//
//    // Constructor
//    public Employee(int id, String name, double salary) {
//        this.id = id;
//        this.name = name;
//        this.salary = salary;
//    }
//
//    // Getters
//    public int getId() { return id; }
//    public String getName() { return name; }
//    public double getSalary() { return salary; }
//
//    @Override
//    public String toString() {
//        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}';
//    }
//}
//
//public class EmployeeSalary {
//	public static void main(String[] args) {
//		List<Employee> list = Arrays.asList(
//				new Employee(1, "John", 25000),
//                new Employee(2, "Alice", 32000),
//                new Employee(3, "Bob", 45000),
//                new Employee(4, "David", 28000),
//                new Employee(5, "Eva", 37000));
//		
//		list.stream()
//		    .filter(e -> e.getSalary()>30000)
//		    .forEach(System.out::println);
//		
//	}
//	
//	
//}
