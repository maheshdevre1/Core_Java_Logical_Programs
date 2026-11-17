package AllDSA;

import java.math.BigInteger;

//Factorial of a big number
public class Prob7 {

	public static void main(String[] args) {
		  int num = 100;
		  BigInteger fact = BigInteger.ONE;
		  for(int i=1; i<=num; i++) {
			  fact = fact.multiply(BigInteger.valueOf(i));
		  }
		  System.out.println(fact);

	}

}
