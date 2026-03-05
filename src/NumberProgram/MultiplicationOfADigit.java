package NumberProgram;

public class MultiplicationOfADigit {
	
	public static void main(String[] args) {
		int num = 12345;
		int mul = 1;
		while(num>0) {
			int digit = num%10;
			mul = mul * digit;
			num = num/10;
		}
		
		System.out.println("Multiplication of digit is : "+  mul);
	}

}
