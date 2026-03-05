package ArrayProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

//check two given array are equal or not
//find element from two array
//find binary number from array ==> binary number contain 01, 00
//find duplicate element in array
//find max and min element from array
//frequency of array element
//find 1st repeating element from array
//find 1st non-repeating element from array
//merge two array element
//find the duplicate from two merged array
//find missing number in arrays
//addition of array element
//print array element
//revrese of array element
//sort array in ascending and descending order
//search array element find index value
public class Practise {
	public static void main(String[] args) {
	    int arr[] = {4,6,1,2,3,0};
	    
	    for(int i=0; i<arr.length; i++) {
	    	for(int j=i+1; j<arr.length; j++) {
	    		if(arr[i]<arr[j]) {
	    			int temp = arr[i];
	    			arr[i] = arr[j];
	    			arr[j] = temp;
	    		}
	    			
	    	}
	    	System.out.print(arr[i] + " ");
	    }
		
		
		
	}
}
