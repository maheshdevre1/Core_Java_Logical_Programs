package AllDSA;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//find second highest salary from each department
//find second highest salary
//Find the youngest employee in each department and return their name and age
// Count employees in each department
//find employee based on id
//sort the employee based on salary ASC or DESC
//sort the employee based on name ASC or DESC
//sort the employee by name in asc and salary in desc
//sort the employee salary greater than 2000

class Employee {
	int id;
    String name;
    String department;
    double salary;
    private int age;

    public Employee(int id, String name, String department, double salary, int age) {
        this.id = id;
    	this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
    }
    
    public int getId() {
    	return id;
    }
    
    public int getAge() {
    	return age;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " - " + salary;
    }
}


public class Prob10 {
	public static void main(String[] args) {
		
		
		List<Employee> list = Arrays.asList(
				 new Employee(1, "Mahesh", "IT", 50000, 28),
				    new Employee(2, "Amit", "IT", 70000, 30),
				    new Employee(3, "Rahul", "IT", 60000, 25),

				    new Employee(4, "Priya", "HR", 40000, 32),
				    new Employee(5, "Neha", "HR", 55000, 27),
				    new Employee(6, "Rupesh", "HR", 50000, 29),

				    new Employee(7, "Karan", "Sales", 45000, 31),
				    new Employee(8, "Ankit", "Sales", 65000, 24),
				    new Employee(9, "Vijay", "Sales", 60000, 26)
		);
		
				   
		list.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary).reversed());
		System.out.println(list);
		
	
	  }
	
	}
		
		
		
		
		
		
		
		
		
		
		
//Find the youngest employee in each department and return their name and age

//Map<String, Optional<Employee>> map = list.stream()
//.collect(Collectors.groupingBy(Employee::getDepartment,
//Collectors.minBy(Comparator.comparingInt(Employee::getAge))));
//
//System.out.println(map);
//
//map.forEach((dept, emp)-> System.out.println(dept + " -> "+ emp.get().getName() 
//+ ", Age: " + emp.get().getAge()));
		
		
//Count employees in each department		
//		
//Map<String, Long> map = list.stream()
//.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));	
//
//System.out.println(map);



//sort the employee salary greater than 2000
//list.stream().filter(i->i.getSalary()>60000).forEach(System.out::println);
// Step 2: Find second highest employee in each department	
		
		   // Step 1: Group employees by department
//        Map<String, List<Employee>> map =
//                employees.stream()
//                         .collect(Collectors.groupingBy(Employee::getDepartment));
//        
//        System.out.println("Map==> "+map);
//
     
//        for (String dept : map.keySet()) {
//        	
//        	System.out.println("Dept ==> "+ dept);
//        	System.out.println("map.get(dept) ==> "+ map.get(dept));
//
//            Employee secondHighest = map.get(dept)
//                    .stream()
//                    .sorted(Comparator.comparing(Employee::getSalary).reversed())
//                    .skip(1)
//                    .findFirst()
//                    .orElse(null);
//
//            System.out.println(dept + " -> " + secondHighest);
//        }
//        
//        

//        //Find Second highest salary from all department
	
//		Employee secondHighest = employees.stream()
//		        .sorted(Comparator.comparing(Employee::getSalary).reversed())
//		        .skip(1)
//		        .findFirst()
//		        .orElse(null);
//
//		System.out.println(secondHighest);
//	}


	


