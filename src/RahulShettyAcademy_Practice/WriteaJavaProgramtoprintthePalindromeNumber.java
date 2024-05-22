package RahulShettyAcademy_Practice;

public class WriteaJavaProgramtoprintthePalindromeNumber {
	public static void main(String[] args) {
		int num = 8998, r = 0, temp = 0, remainder = 0;
		temp = num;
		while (num > 0) {
			remainder = num % 10;
			r = r * 10 + remainder;
			num = num / 10;
		}
		if (temp == r) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}
}
