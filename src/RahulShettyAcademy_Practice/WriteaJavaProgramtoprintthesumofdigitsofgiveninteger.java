package RahulShettyAcademy_Practice;

public class WriteaJavaProgramtoprintthesumofdigitsofgiveninteger {
public static void main(String[] args) {
	String n ="0265";
	int r;
	int sum=0;
	int temp;
	int num = Integer.parseInt(n);
	temp=num;

	while(num>0)
	{
		r = num % 10;
		sum = sum+r;
		num = num/10;
	}
	System.out.println(sum);
}
}
