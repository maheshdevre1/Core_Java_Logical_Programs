package GuessOutput_OOPS;

//abstract means the method must be overridden by a subclass.
//private means the method cannot be inherited or overridden.

abstract class Bank {

    //private abstract void withdraw();   // Line 1//
    abstract void deposit();

    public void balance() {}            // Line 2
}

class Office extends Bank {             // Line 3

    void deposit() {                    // Line 4
        // TODO
    }
}

public class Prob1 {
	public static void main(String[] args) {
		
	}

}
