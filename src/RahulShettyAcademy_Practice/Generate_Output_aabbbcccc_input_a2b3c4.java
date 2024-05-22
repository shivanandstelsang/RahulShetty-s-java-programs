package RahulShettyAcademy_Practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Generate_Output_aabbbcccc_input_a2b3c4 {
	public static void main(String[] args) {
		String str = "a2b3c4";
		StringBuilder otpt = new StringBuilder();
		Pattern pattern = Pattern.compile("([a-zA-Z])(\\d+)");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			String Character = matcher.group(1);
			int count = Integer.parseInt(matcher.group(2));

			for (int i = 0; i < count; i++) {
				otpt.append(Character);
			}
		}
		System.out.println(otpt.toString());

	}
}