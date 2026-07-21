package ArrayDSA;

//Given an array arr[] of non-negative integers, where each element arr[i] represents the height of the vertical lines, find the maximum amount of water that can be contained between any two lines, together with the x-axis.
//
//Examples :  
//
//Input: arr[] = [1, 5, 4, 3]
//Output: 6
//Explanation: 5 and 3 are 2 distance apart. So the size of the base = 2. Height of container = min(5, 3) = 3. So total area = 3 * 2 = 6.

public class ContainerWater {
	public static void main(String[] args) {
		 int arr[] = {1, 5, 4, 3};
		  int maxArea = 0;
		  for(int i=0; i<arr.length; i++) {
			  for(int j=i+1; j<arr.length; j++) {
				  int height = Math.min(arr[i],arr[j]);
				  int width = j-i;
				  int area = height*width;
				  if(area>maxArea) {
					  maxArea=area;
				  }
			  }
		  }
		  System.out.println(maxArea);
	}

}
