package RahulShettyAcademy_Practice;

public class WriteaJavaProgramtoprintthePrimeNumber {

	public static boolean findprimeNumber(int num) {
		for (int i = 2; i < num; i++) {
			if (num % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	public static void getprimeNumber(int num) {
		for (int i = 2; i < num; i++) {
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		System.out.println(findprimeNumber(15));
		getprimeNumber(10);
	}
}
