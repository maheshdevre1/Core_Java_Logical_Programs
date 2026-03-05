package StringProgram;

public class RemoveWhiteSpacesFromString {
	public static void main(String[] args) {
		String str = "java is opp";
		String newString = "";
		
		String removeWhiteSpaces = str.replaceAll("\\s+", "");
		System.out.println("removeWhiteSpaces ==> "+removeWhiteSpaces);
		char ch[] = str.toCharArray();
		for (char c : ch) {
			if (c != ' ') {
				newString = newString + c;
			}
        }
		System.out.println("remove white spaces from string ==> " + newString);
	}
	
	

}
