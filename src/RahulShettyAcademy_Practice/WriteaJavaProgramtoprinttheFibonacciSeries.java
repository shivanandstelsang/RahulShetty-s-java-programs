package RahulShettyAcademy_Practice;

public class WriteaJavaProgramtoprinttheFibonacciSeries {
	public static void main(String[] args) {
//Fibonacci Series -->The Fibonacci sequence is a series of numbers where each number is the sum of the two numbers that come before it. 
		//The sequence is commonly written as 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, and so on. 
		
		int n1=0, n2=1, n3=0, num=15;
		System.out.println(n1+"\n"+n2);
		for(int i=2;i<num;i++)
		{
			n3=n2+n1;
			System.out.println(" " + n3);
			n1=n2;
			n2=n3;
		}
	}

}
