package ArrayDSA;

import java.util.Arrays;
import java.util.List;

public class RainWater {
	public static void main(String[] args) {
		
		
	       // System.out.println("Start small. Ship something.");
	        List<Integer> list = Arrays.asList(2,1,3,4,5,6);
	        long secondHighest = list.stream()
	            .distinct().sorted((a,b)-> b-a).skip(1)
	            .findFirst()
	            .orElseThrow(()-> new RuntimeException("List is notsufficient"));
	        
	        System.out.println(secondHighest);
	            
	           //System.out.println(secondHighest);
	    
	}

}
