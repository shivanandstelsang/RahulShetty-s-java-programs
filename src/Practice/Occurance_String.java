package Practice;

public class Occurance_String {
	public static void main(String[] args)
	{
		String str = "KEYBALL";
		String rev = "";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(rev.indexOf(ch)<0)
			{
				rev = rev+ch;
			}
		}
		System.out.println(rev);
		for(int i=0;i<rev.length();i++)
		{
			char ch = rev.charAt(i);
			int count=0;
			for(int j=0;j<str.length();j++)
			{
				if(ch==str.charAt(j)) {
					count++;
				}
			}
			System.out.println(ch + " " + "occurances" + " " + count + " " + "times(s)");

		}
	}
}
