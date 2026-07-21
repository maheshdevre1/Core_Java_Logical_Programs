package ArrayDSA;

import java.math.BigInteger;

public class FactorialOfLargeNumber {
	public static void main(String[] args) {
		  int num = 100;
		  BigInteger fact = BigInteger.ONE;
		  for(int i=1; i<=num; i++) {
			  fact = fact.multiply(BigInteger.valueOf(i));
		  }
		  System.out.println(fact);
	  }

}
