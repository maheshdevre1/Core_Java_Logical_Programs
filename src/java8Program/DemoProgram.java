package java8Program;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
//frequency of string
//find second highest number
//reverse of string
//sort the list of integer
//find duplicate from the list
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import Multhreading.RunnableExample;

/*Java 8 program*/
//frequency of character
//frequency of a word
//find second highest number or second lowest
//findduplicatefromlistofInteger
//sort the element ascending or descending order using java8
//find the count of integer
//find even or odd
//find maximum or minimum element from list of integer
//find first element from list of integer
//check no is prime or not
//find the prime number between the range

//next practice start from here
//How do you merge two unsorted arrays into single sorted array using Java 8 streams?
//10) How do you merge two unsorted arrays into single sorted array without duplicates?
//How do you get three maximum numbers and three minimum numbers from the given list of integers?
//revrese list of integer
//20) Reverse an integer array
//Write a program using stram api Employee salary is above 30000 create a employee object 
//create a functional interface
//FindTheNumberStartWith1
//find common element from the array

// **********************************************************************
//How do you merge two unsorted arrays into single sorted array using Java 8 streams?

//Java 8 program to check if two strings are anagrams or not?
//13) Find sum of all digits of a number in Java 8?
//15) Given a list of strings, sort them according to increasing order of their length?
//16) Given an integer array, find sum and average of all elements?
//17) How do you find common elements between  two List of integer?
//18) Reverse each word of a string using Java 8 streams?
//19) How do you find sum of first 10 natural numbers?
//20) Reverse an integer array
//21) Print first 10 even numbers
//22) How do you find the most repeated element in an array of list
//23) Palindrome program using Java 8 streams
//24) Given a list of strings, find out those strings which start with a number?
//26) Print duplicate characters in a string?
//27) Find first repeated character in a string?
//28) Fibonacci Series
//30) First 10 odd numbers
//How do you get last element of an array 
//Write a program using stram api Employee salary is above 30000 create a employee object 
//List of employee object
/*New program*/
//reverse a list of integer
public class DemoProgram {

	public static void main(String[] args) {
		//int num = 18;
		
		IntStream.rangeClosed(3,30)
		         .filter(num -> {
		        	 return num>1 && IntStream.rangeClosed(2, 
		        			 (int) Math.sqrt(num)).noneMatch(e->num%e==0);
		         }).forEach(System.out::println);
		
		
	
	}
}
