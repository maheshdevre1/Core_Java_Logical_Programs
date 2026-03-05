import java.util.stream.IntStream;

public class Testt {
public static void main(String[] args) {
	System.out.println("hello");
	
	
	//print 1 to 100
	
	
	printdata();
}

private static void printdata() {
	IntStream.rangeClosed(1, 100).filter(n-> n%2==0).forEach(System.out::println);
	
}
}


