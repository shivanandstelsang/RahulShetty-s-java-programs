package RahulShettyAcademy_Practice;

import java.util.Scanner;

public class WriteaJavaProgramtoprinttheswap2numberwithout3rdvariable {
	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("before swapping the numbers " + x + " " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("after swapping the numbers " + x + " " + y);

	}

}
