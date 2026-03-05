package ArrayProgram;

public class ReverseAArrayElement {

	public static void main(String[] args) {
		int arr[] = {1,3,4,6,8,9};
		
		int length = arr.length;
		for(int i=length-1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

}
