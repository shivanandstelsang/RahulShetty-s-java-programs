package Practice;

public class StringPalindrome {
	public static void main(String[] args) {
		String str = "goog";
		String res = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			res = res + ch;
		}
		if (res.equals(str)) {
			System.out.println( res + " : string is palindrome");
		} else {
			System.out.println( res + " : not a palindrome");
		}
	}
}