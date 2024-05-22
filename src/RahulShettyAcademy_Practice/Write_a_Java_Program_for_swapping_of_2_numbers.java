package RahulShettyAcademy_Practice;
import java.util.Scanner;

public class Write_a_Java_Program_for_swapping_of_2_numbers {
public static void main(String[] args) {
	int t,x,y;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	x = sc.nextInt();
	y = sc.nextInt();
	System.out.println("before swapping " + x + " " + y);
	t=x;
	x=y;
	y=t;
	System.out.println("before swapping " + x + " " + y);
}
}
