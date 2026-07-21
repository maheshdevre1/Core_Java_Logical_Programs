package ArrayDSA;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {
		
		int a1[] = {1,3,5};//3,4,6
		int a2[]  = {2,4,6};
		
		int merge[] = new int[a1.length+a2.length];
		
		for(int i=0; i<a1.length; i++) {
			merge[i] = a1[i];
		}
		
		for(int i=0; i<a1.length; i++) {
			merge[i+a2.length] = a2[i];
		}
		
	//	System.out.println(Arrays.toString(merge));
		
		for(int i=0; i<merge.length; i++) {
			for(int j=i+1; j<merge.length; j++) {
				if(merge[i]>merge[j]) {
					int temp = merge[i];
					merge[i] = merge[j];
					merge[j] = temp;
				}
			}
		}
		
		
		System.out.println(Arrays.toString(merge));

		    
		
		
	  }
}
