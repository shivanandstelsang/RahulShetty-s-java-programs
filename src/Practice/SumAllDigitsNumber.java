package Practice;

public class SumAllDigitsNumber {
	public static void main(String[] args) {
		int n = 56991, sumofalldigits = 0;
		for (sumofalldigits = 0; n != 0; n = n / 10) {
			sumofalldigits = sumofalldigits + n % 10;
		}
		System.out.println(sumofalldigits);
	}

}
