package ArrayProgram;

public class MultiplicationOfArrayElement {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40, 50};
		int length = arr.length;
		int mul = 1;
		for(int i=0;i<length ;i++) {
			mul = mul * arr[i];
		}
		System.out.println("mul of array element " + mul); 
	}


}
