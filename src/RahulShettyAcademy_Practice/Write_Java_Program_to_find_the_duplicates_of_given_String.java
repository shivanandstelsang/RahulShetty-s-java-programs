package RahulShettyAcademy_Practice;

public class Write_Java_Program_to_find_the_duplicates_of_given_String {
public static void main(String[] args) {
	String s = "rahulshettyacademy";
	String r = "";
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		char ch = s.charAt(i);
		if(r.lastIndexOf(ch)<0)
		{
			r = r+ch;
			count++;
		}
	}
	System.out.println(r);
	System.out.println(count);
}
}
