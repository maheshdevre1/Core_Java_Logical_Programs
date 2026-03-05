package java8Program;

import java.util.Arrays;

public class Given_an_integer_array_find_sum_and_average_of_all_elements {
	
	public static void main(String[] args) 
    {
        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
         
        int sum = Arrays.stream(a).sum();
         
        System.out.println("Sum = "+sum);
         
        double average = Arrays.stream(a).average().getAsDouble();
         
        System.out.println("Average = "+average);
    }

}
