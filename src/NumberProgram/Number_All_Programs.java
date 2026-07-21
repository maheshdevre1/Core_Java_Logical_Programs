package NumberProgram;

import java.util.Arrays;

public class Number_All_Programs {
	public static void main(String[] args) {
		//Addition_of_a_digit();
		//multiplication_of_a_digit();
		//revrese_of_a_digit();
		//check_no_is_palindrone_or_not();
		//check_number_is_prime_or_not();
		//find_prime_no_between_3_to_30();
        //check_number_is_anagram_or_not();
		//fibanacci_series();
		//check_no_is_even_or_odd();
		SumOfSquareOddOrEvenDigit();
	}

	private static void SumOfSquareOddOrEvenDigit() {
		int num = 123456789;
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			if (rem % 2 != 0) {
				sum = sum + (rem * rem);
			}
			num = num / 10;
		}

		System.out.println("Sum of square of even digit ==> " + sum);
		
	}

	private static void check_no_is_even_or_odd() {
		int num = 11;

		if (num % 2 == 0) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is Odd");
		}
	}

	private static void fibanacci_series() {
		int a = 0, b = 1, c = 50;
		while (c <= 100) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;

		}
	}

	private static void check_number_is_anagram_or_not() {
		int num1= 12345;
		int num2 = 54321;
		
		//convert number in string 
		String num1String = String.valueOf(num1);
		String num2String = String.valueOf(num2);
		
		char num1Array[] = num1String.toCharArray();
		char num2Array[] = num2String.toCharArray();
		
		Arrays.sort(num1Array);
		Arrays.sort(num2Array);
		
		boolean b = Arrays.equals(num1Array, num2Array);
		if(b == true) {
			System.out.println("No is anagram");
		}else {
			System.out.println("No is not anagram");
		}
	}

	private static void find_prime_no_between_3_to_30() {
		for (int i =3; i<=30; i++) {
			int count = 0;
			for(int j=2; j<=i/2; j++) {
				if(i%j==0) {
					count ++;
				}
			}
			if(count == 0) {
				System.out.println(i);
			}
			
		}
		
	}

	private static void check_number_is_prime_or_not() {
		int num = 17, count = 0;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				count++;
			}
		}

		if (count == 0) {
			System.out.println("No is prime no");
		} else {
			System.out.println("No is prime");
		}
		
	}

	private static void check_no_is_palindrone_or_not() {
        int num = 121;
		
		int rev = 0;
		int originalNum = num;
		
		
		while(num>0) {
			 int digit = num%10;
			 rev = rev*10 + digit;
			 num = num/10;
		}
		
		System.out.println("Reverse of a digit ==> "+rev);
		
		if(originalNum == rev) {
			System.out.println("Number is Palindrone");
		}else {
			System.out.println("Number is not palindrone");
		}
		
	}

	private static void revrese_of_a_digit() {
        int num = 1234;
		
		int rev = 0;
		
		while(num>0) {
			 int digit = num%10;
			 rev = rev*10 + digit;
			 num = num/10;
		}
		
		System.out.println("Reverse of a digit ==> "+rev);
	}

	private static void multiplication_of_a_digit() {
		int num = 12345;
		int mul = 1;
		while(num>0) {
			int digit = num%10;
			mul = mul * digit;
			num = num/10;
		}
		
		System.out.println("Multiplication of digit is : "+  mul);
	}

	private static void Addition_of_a_digit() {
		int num = 12345;
		int sum = 0;
	
		while(num>0) {
			int digit = num%10;
			sum = sum + digit;
			num = num/10;
			
		}
		
		System.out.println("sum of digit is ==> "+ sum);
		
	}

}
