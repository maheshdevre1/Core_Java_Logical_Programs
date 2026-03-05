package ArrayProgram;

public class SortAnArray {
	public static void main(String[] args) {
		int arr[] = { 34, 12, 24, 67, 89, 23, 12 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];     
					arr[i] = arr[j];            
					arr[j] = temp;       
                }
			}
		}
        for (int a : arr) {
			System.out.println(a);
		}
       }
	}
