package Re_Practice;

public class Fibonacci_Series {
	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3 = 0, num = 10;
		System.out.println(n1 + " " + n2);
		for (int i = 2; i < num; i++) {
			n3 = n2 + n1;
			System.out.println(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}
}
