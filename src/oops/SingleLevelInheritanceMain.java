package oops;

//Parent class (Super Class)
class Animal {
	void eat() {
		System.out.println("Animal is eating...");
	}
}

//Child class (Sub Class)
class Dog extends Animal {
	void bark() {
		System.out.println("Dog is barking...");
	}
}

public class SingleLevelInheritanceMain {

	public static void main(String[] args) {
		Dog d = new Dog(); // Object of subclass

		d.eat(); // Method from parent class
		d.bark(); // Method from child class
	}

}
