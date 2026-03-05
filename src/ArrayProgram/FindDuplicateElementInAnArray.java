package ArrayProgram;

public class FindDuplicateElementInAnArray {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 5, 6, 4, 9, 2, 5 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}
}
