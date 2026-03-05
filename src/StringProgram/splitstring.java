package StringProgram;

public class splitstring {
	
	public static void main(String[] args) {
		
	        String input = "mahesh$devre";
	        String[] parts = input.split("\\$");  // Split the string at $
	        System.out.println(parts[0]);         // Output: mahesh
	        System.out.println(parts[1]); 
	    }
	

}
