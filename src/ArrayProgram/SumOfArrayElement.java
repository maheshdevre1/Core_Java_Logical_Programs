package ArrayProgram;

public class SumOfArrayElement {
	
	public static void main(String[] args) {
		int arr[] = {10,20,30,40, 50};
		int length = arr.length;
		int sum = 0;
		for(int i=0;i<length ;i++) {
			sum = sum + arr[i];
		}
		System.out.println("sum of array element" + sum); 
	}

}
