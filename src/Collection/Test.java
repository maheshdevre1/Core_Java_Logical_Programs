package Collection;

import java.util.HashMap;

class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override hashCode
//    @Override
//    public int hashCode() {
//        return id; // simple logic (better to use Objects.hash)
//    }

    // Override equals
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//
//        Employee emp = (Employee) obj;
//        return this.id == emp.id;
//    }
}

public class Test {
	 public static void main(String[] args) {

	        HashMap<Employee, String> map = new HashMap<>();

	        Employee e1 = new Employee(1, "Mahesh");
	        Employee e2 = new Employee(1, "Mahesh");

	        map.put(e1, "Developer");

	        System.out.println(map.get(e2)); // Works because equals + hashCode
	    }
   
}
