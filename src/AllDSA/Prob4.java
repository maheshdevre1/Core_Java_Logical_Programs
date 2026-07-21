package AllDSA;

//Given an integer array arr[], find the subarray (containing at least one element) 
//which has the maximum possible sum, and return that sum.
//Note: A subarray is a continuous part of an array.
//Examples:
//Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
//Output: 11
//Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.

public class Prob4 {
	public static void main(String[] args) {
		int arr[] = {2, 3, -8, 7, -1, 2, 3};
		//int arr[] = {1,2,3,4,5};
        int maxSum = arr[0];//1
        for(int i=0; i<arr.length; i++) {
        	int currentSum = 0;
        	for(int j=i; j<arr.length; j++) {//j=0
        		currentSum = currentSum + arr[j];//
        		if(currentSum>maxSum) {
        			maxSum = currentSum;
        		}
        	}
        }
        
        System.out.println(maxSum);
	}

}
