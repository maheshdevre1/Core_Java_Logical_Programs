package AllDSA;

public class Prob30 {
	public String longestCommonPrefix(String[] strs) {
	    String prefix = strs[0];
	    for (int i = 1; i < strs.length; i++) {
	        while (!strs[i].startsWith(prefix)) {
	            prefix = prefix.substring(0, prefix.length() - 1);
	            System.out.println(prefix);
	            if (prefix.length() == 0) {
	                return "";
	            }
	        }
	    }
	    return prefix;
	}
	public static void main(String[] args) {
		String []str = {"flower","flow","flight"};
		Prob30 p = new Prob30();
		String s = p.longestCommonPrefix(str);
		System.out.println(s);
		
	}

}
