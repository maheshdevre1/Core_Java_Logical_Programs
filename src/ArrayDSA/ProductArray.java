package ArrayDSA;
//Given an array arr[] of n integers, construct a product array res[] (of the same size) such that res[i] is equal to the product of all the elements of arr[] except arr[i]. 
//
//Example: 
//
//Input: arr[] = [10, 3, 5, 6, 2]
//Output: [180, 600, 360, 300, 900]
//Explanation: 
//For i=0, res[i] = 3 * 5 * 6 * 2 is 180.
//For i = 1, res[i] = 10 * 5 * 6 * 2 is 600.
//For i = 2, res[i] = 10 * 3 * 6 * 2 is 360.
//For i = 3, res[i] = 10 * 3 * 5 * 2 is 300.
//For i = 4, res[i] = 10 * 3 * 5 * 6 is 900.

public class ProductArray {
	public static void main(String[] args) {
		int arr[] = {10, 3, 5, 6, 2};
		int res[] = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			int mul = 1;
			for(int j=0; j<arr.length; j++) {
				if(i!=j) {
					mul = mul*arr[j];
				}
			}
			
			res[i]=mul;
			
		}
		
		for(int value : res) {
			System.out.print(value + " ");
		}
	}

}
