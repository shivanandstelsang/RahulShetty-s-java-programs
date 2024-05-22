package Re_Practice;

public class ReverseAString {
public static void main(String[] args)
{
	String s = "Royala";
	String rev = "";
	for(int i=s.length()-1;i>=0;i--)
	{
		char ch = s.charAt(i);
		if(rev.indexOf(ch)<0)
		{
			rev=rev+ch;
		}
	}
	System.out.println(rev);
}
}
