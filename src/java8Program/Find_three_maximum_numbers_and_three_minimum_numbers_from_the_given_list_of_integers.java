package java8Program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Find_three_maximum_numbers_and_three_minimum_numbers_from_the_given_list_of_integers {
	
	public static void main(String[] args) 
    {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
         
        //3 minimum Numbers
         
        System.out.println("-----------------");
         
        System.out.println("Minimum 3 Numbers");
         
        System.out.println("-----------------");
         
        listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);
         
        //3 Maximum Numbers
         
        System.out.println("-----------------");
         
        System.out.println("Maximum 3 Numbers");
         
        System.out.println("-----------------");
         
        listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }

}
