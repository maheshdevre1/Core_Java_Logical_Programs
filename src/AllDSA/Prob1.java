package AllDSA;
//Delivery Route Optimization
//You are a manager at a logistics company, and you are responsible for optimising the delivery routes for your drivers. Each driver is assigned a //specific route represented by positive or negative numbers, which indicates the distance they need to travel to reach each delivery location.
//To ensure that your drivers' routes are efficient, you want to find the first position where the sum of the distances before that point is equal to the sum of the distances after it.
//The indices are 1-based, meaning the first element in the array has an index of 1.
//Sample Input
//5
//2 2 5 6 -2
//Sample Output
//3
//Explanation
//An array representing one of your driver's routes is:
//[2, 2, 5, 6, -2]
//The required point is at index 3 because:
//Sum of the distances before index 3 = 2 + 2 = 4
//Sum of the distances after index 3 = 6 + (-2) = 4
//Since both sums are equal, the answer is:
//3

import java.util.Scanner;

public class Prob1 {
	 // Method to find the equilibrium index (1-based)
    public static int optimizedRoute(long[] arr, int n) {

        // Calculate total sum of the array
        long totalSum = 0;
        for (long num : arr) {
            totalSum += num;
        }

        // Initialize left sum
        long leftSum = 0;

        // Traverse the array
        for (int i = 0; i < n; i++) {

            // Calculate right sum
            long rightSum = totalSum - leftSum - arr[i];

            // Check if left sum equals right sum
            if (leftSum == rightSum) {
                return i + 1; // Return 1-based index
            }

            // Update left sum
            leftSum += arr[i];
        }

        // No equilibrium index found
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read array size
        int n = sc.nextInt();

        // Create array
        long[] arr = new long[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        // Print result
        System.out.println(optimizedRoute(arr, n));

        sc.close();
    }

}
