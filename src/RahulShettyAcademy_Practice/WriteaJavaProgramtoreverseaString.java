package RahulShettyAcademy_Practice;

public class WriteaJavaProgramtoreverseaString {
	public static void main(String[] args) {
		String str = "Tutorial";
		String rev = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch = str.charAt(i);
			if(rev.lastIndexOf(ch)<0)
			{
				rev = rev+ch;
			}
		}
		
		System.out.println(rev);

	}

}
