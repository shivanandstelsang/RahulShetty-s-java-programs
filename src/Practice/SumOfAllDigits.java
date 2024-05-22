package Practice;

public class SumOfAllDigits {
	public static void main(String[] args)
	{
		int n=12345, sumofdigits;
		for(sumofdigits=0;n!=0;n=n/10)
		{
			sumofdigits=sumofdigits+n%10;
		}
		System.out.println(sumofdigits);
	}

}
