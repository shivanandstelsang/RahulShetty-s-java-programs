package RahulShettyAcademy_Practice;

public class WriteaJavaProgramtoprinttheArmStrongNumber {
	public static void main(String[] args) {
		int cube = 0, temp = 0 , num = 153, r;
		temp=num;
		while (num > 0) {
			r = num % 10;
			cube = cube + (r * r * r);
			num = num / 10;
		}
		if (cube == temp) {
			System.out.println("armstrong number");
		} else {
			System.out.println("not an armstrong number");
		}
	}
}
