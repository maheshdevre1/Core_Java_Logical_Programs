package ArrayProgram;

public class FindSmallestAndLargestNumberInArray {

    public static void main(String[] args) {
        int arr[] = {10, 20, 5, 89, 45};
        
        int smallest = arr[0];
        
        for(int i = 1; i<arr.length; i++) {
        	if(arr[i]<smallest) {//for largest element arr[i]>smallest
        		smallest=arr[i];
        	}
        }
        System.out.println("Smallest element is ==> "+smallest);
     }
}

