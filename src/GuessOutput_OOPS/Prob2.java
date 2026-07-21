package GuessOutput_OOPS;

public class Prob2 {
	
	public void foo(int a)
	{
	    System.out.print(a % 10);//4

	    if (a % 10 != 0) {
	        foo(a / 10);//123
	    }

	    System.out.print(a % 10);//3
	}

	public static void main(String[] args) {
		Prob2 p = new Prob2();
		p.foo(1234);

	}

}
