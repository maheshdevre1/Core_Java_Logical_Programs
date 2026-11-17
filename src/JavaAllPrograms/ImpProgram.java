package JavaAllPrograms;
//reverse each word of string//normal way and java 8
//reverse word of array
//frquency, find duplicate/without 1st and maxKey
//singeleton class

import java.util.Arrays;


public class ImpProgram {
	public static void main(String[] args) {
		String str = "Java am Mahesh";
        String[] words = str.split(" ");
        String rev = "";
        for(String word : words){
           String r = word + " ";
           
           for(int i=r.length()-1; i>=0; i--) {
        	   rev = rev + r.charAt(i);
           }
            
        }
        
        System.out.println(rev.trim());

         
		
	}

}
