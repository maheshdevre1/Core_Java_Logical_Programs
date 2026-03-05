package exception;

/*What will happen if I execute this program */

public class Main{
    static A a1 = new A();
    
    public static void main(String [] a) throws Exception {
        try{
            a1.doSomething("Hello there how are you");
            a1.doSomething("Namaste");
        } catch (RuntimeException t) {
            System.err.println("Input was invlid");
            System.exit(1);
        }
        System.out.println("Exiting");
    }
}

/*==============*/

class A {
	// private String doSomething(String value) throws Exception {
    public String doSomething(String value) throws Exception {
        if(value.length() > 10) {
            throw new Exception ("Invalid value");
        } 
        System.out.println("Length is "+value.length());
        return value.toUpperCase();
    }
}

