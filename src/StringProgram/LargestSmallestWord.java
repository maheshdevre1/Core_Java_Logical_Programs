package StringProgram;

public class LargestSmallestWord {
	public static void main(String[] args) {
		String input = "Java is a powerful programming language";

		// Split the string into words
		String[] words = input.split(" ");

		String smallest = words[0];
		String largest = words[0];

		for (String word : words) {
			if (word.length() < smallest.length()) {
				smallest = word;
			}
			if (word.length() > largest.length()) {
				largest = word;
			}
		}

		System.out.println("Smallest word: " + smallest);
		System.out.println("Largest word: " + largest);
	}

}
