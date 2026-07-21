package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcurrentModificationException {
	
	  public static void main(String[] args) {

	        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));

	        for (Integer i : list) {
	            if (i == 2) {
	               // list.remove(i); // ❌ modification during iteration
	            }
	        }
	    }

}
