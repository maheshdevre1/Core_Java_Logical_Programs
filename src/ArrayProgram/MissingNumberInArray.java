package ArrayProgram;

public class MissingNumberInArray
{
    public static void main(String[] args)
    {
        // Define the total number of elements including the missing one
        int n = 8;
  
        // Define the given array with one missing number
        int[] a = {1, 4, 5, 3, 7, 8, 6};
  
        // Step 1: Calculate the expected sum of first 'n' natural numbers
        // Using the formula: sum = (n * (n + 1)) / 2
        int sumOfNnumbers = (n * (n + 1)) / 2;
  
        // Step 2: Calculate the sum of elements present in the array
        int sumOfElements = 0;
  
        // Traverse through the array and accumulate the sum
        for (int i = 0; i < a.length; i++)
        {
            sumOfElements += a[i];
        }
  
        // Step 3: The missing number is the difference between the expected sum and actual sum
        int missingNumber = sumOfNnumbers - sumOfElements;
  
        // Display the missing number
        System.out.println("Missing Number is = " + missingNumber);
    }
}
