
public class CallByValue {

	public static void main(String[] args) {
	   int a=10;
	   change(a);
	   System.out.println(a);

	}

	 static void change(int a) {
		a=100;
	}

}
