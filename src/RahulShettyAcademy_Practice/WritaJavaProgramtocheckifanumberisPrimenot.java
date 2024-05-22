package RahulShettyAcademy_Practice;

public class WritaJavaProgramtocheckifanumberisPrimenot {
	public static boolean findprimeNumber(int num) {
		for (int i = 2; i < num; i++) {
			if (num % 2 == 0) {
				return false;
			}
		}
		return true;

	}

	public static void getPrimeNumber(int num) {
		for (int i = 2; i < num; i++) {
			System.out.println(i + " ");
		}
	}

	public static void main(String[] args) {
		System.out.println(findprimeNumber(3));
		getPrimeNumber(15);
	}

}
