package RahulShettyAcademy_Practice;

public class WriteaJavaProgramtoprinttheFactorial {
	public static void main(String[] args) {
		int fact = 1, num = 7;
		for (int i = 2; i <= num; i++) {
			fact = fact * i;
			System.out.println(fact);
		}

	}

}
