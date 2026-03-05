package Multhreading;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	String name;
	transient int age; // This field will not be serialized

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee{name='" + name + "', age=" + age + "}";
	}

}

public class TransientKeyword {
	public static void main(String[] args) {
		Employee emp = new Employee("John Doe", 30);

		// Serialize the object
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
			oos.writeObject(emp);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Deserialize the object
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))) {
			Employee deserializedEmp = (Employee) ois.readObject();
			System.out.println("Deserialized Employee: " + deserializedEmp);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
