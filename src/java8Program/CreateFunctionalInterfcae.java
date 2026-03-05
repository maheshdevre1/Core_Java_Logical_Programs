package java8Program;

@FunctionalInterface
interface FuncInterfaceExample{
    int sum(int a, int b);
    default int multiply(int a, int b) {
        return a*b;
    }
}

public class CreateFunctionalInterfcae {
	public static void main(String args[]) {
	      FuncInterfaceExample obj = (a,b) -> a+b; 
	      System.out.println("Sum of two numbers is: " +obj.sum(4,8));
	    }

}
