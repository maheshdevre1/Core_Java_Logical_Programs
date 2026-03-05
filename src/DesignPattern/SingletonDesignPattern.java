package DesignPattern;

class Singleton {
	// Static variable to hold the single instance
	private static Singleton instance;

	// Private constructor to prevent instantiation
	private Singleton() {
		System.out.println("Singleton instance created.");
	}

	// Public method to provide access to the instance
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton(); // Lazy initialization
		}
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello from Singleton!");
	}
}

public class SingletonDesignPattern {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		s1.showMessage();
		s2.showMessage();

		// Check if both references point to the same object
		System.out.println("Are both instances same? " + (s1 == s2)); // true
	}

}
