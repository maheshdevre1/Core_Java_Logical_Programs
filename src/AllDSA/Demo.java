package AllDSA;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import javax.swing.plaf.synth.SynthOptionPaneUI;


public class Demo {
	


	public static void main(String[] args) {
		int arr[] = {1, 5, 4, 3};
	    int maxArea=0;
		for(int i=0; i<arr.length; i++) {
		
			for(int j=i+1; j<arr.length; j++) {
			   int height = Math.min(arr[i], arr[j]);
			   int width = j-i;
			   int area = height * width;
			   if(area> maxArea) {
				   maxArea = area;
			   }
			}
			
		     
		}
		
		System.out.println(maxArea);
		
		
	}
	   
}
