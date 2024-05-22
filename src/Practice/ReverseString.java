package Practice;

public class ReverseString {
	public static void main(String [] args)
	{
		String str= "Testing";
		String rev = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch = str.charAt(i);
			if(rev.indexOf(ch)<0)
			{
				rev=rev+ch;
			}
		}
		System.out.println(rev);
	}

}
