package RahulShettyAcademy_Practice;

public class Write_Program_to_count_the_number_of_characters_in_given_String {
	public static void main(String[] args) {
		String s = "Rahul";
		String res = "";
		int count=0;
		s=s.replaceAll("\\s", "");
		for(int i=0;i<s.length();i++)
		{
			res=res+s.charAt(i);
			count++;
		}
		System.out.println(count);
	}

}
