
package AllDSA;

//You are organising a music concert and want to arrange the performers on stage in a visually appealing manner. To achieve this, each performer will be represented by a distinct integer, and you want to ensure the positioning of performers on stage.
//To do this, you have a list of performers in the order of their appearance. The list is already sorted in ascending order, based on their popularity. However, you need to rearrange the performers in such a way that when they appear on stage one after the other, their popularity alternates between high and low.
//For example, suppose you have a sorted list of performers:
//[1, 2, 3, 4, 5, 6, 7]
//The desired arrangement would be:
//[2, 1, 4, 3, 6, 5, 7]
//where each element at an even index is greater than its adjacent elements at odd indices.
//In other words, the required wave pattern is:
//A[0] > A[1] < A[2] > A[3] < A[4] > A[5] ...


public class Prob11 {

	public static void main(String[] args) {
		   int[] arr = {1, 2, 3, 4, 5, 6, 7};
		   
		   // Swap adjacent elements
	        for (int i = 0; i < arr.length - 1; i = i + 2) {

	            int temp = arr[i];//1//3
	            arr[i] = arr[i + 1];//2//4
	            arr[i + 1] = temp;//1//3
	        }

	        // Print result
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }

	}

}
