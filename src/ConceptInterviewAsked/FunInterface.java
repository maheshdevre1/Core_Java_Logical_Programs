package ConceptInterviewAsked;

@FunctionalInterface
interface Fun{
	
	public int sum(int a, int b);
	default int mul(int a, int b) {
		return a*b;
	}
	
	public static void sts() {
		prv();
		System.out.println("This is static method");
	}
	
	private static void prv() {
		System.out.println("This is Private Method");
	}
}

public class FunInterface {
	public static void main(String[] args) {
		Fun f = (a,b)->(a+b);
		System.out.println(f.sum(10, 20));
		System.out.println(f.mul(10, 30));
		Fun.sts();
	}
	

}
