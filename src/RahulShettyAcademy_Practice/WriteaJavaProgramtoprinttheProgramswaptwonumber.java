package RahulShettyAcademy_Practice;

import java.util.Scanner;

public class WriteaJavaProgramtoprinttheProgramswaptwonumber {
public static void main(String[] args)
{
	int x,y,t;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	x= sc.nextInt();
	y=sc.nextInt();
	System.out.println("before swapping the numbers " + x + " " + y);
	t=x;
	x=y;
	y=t;
	System.out.println("after swapping the numbers " + x + " " + y);

}
}