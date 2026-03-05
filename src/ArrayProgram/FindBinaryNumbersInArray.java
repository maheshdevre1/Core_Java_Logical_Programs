package ArrayProgram;

public class FindBinaryNumbersInArray {

    public static void main(String[] args) {
        String[] arr = { "1010", "1234", "0011", "1101", "89", "000", "111", "abc" };

        System.out.println("Binary numbers in the array:");

        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            boolean isBinary = true;

            // Check if each character is either '0' or '1'
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (ch != '0' && ch != '1') {
                    isBinary = false;
                    break;
                }
            }

            if (isBinary) {
                System.out.println(str);
            }
        }
    }
}
