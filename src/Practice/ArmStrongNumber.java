package Practice;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int r = 0, num = 153, cube = 0, temp;
		temp = num;
		while (num > 0) {
			r = num % 10;
			cube = cube + (r * r * r);
			num = num / 10;
		}
		if (cube == temp) {
			System.out.println("it is arm-strong-number");
		} else {
			System.out.println("it is not arm-strong-number");
		}
	}

}
