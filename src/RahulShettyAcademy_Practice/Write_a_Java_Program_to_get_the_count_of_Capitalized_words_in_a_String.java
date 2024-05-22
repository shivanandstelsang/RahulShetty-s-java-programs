package RahulShettyAcademy_Practice;

public class Write_a_Java_Program_to_get_the_count_of_Capitalized_words_in_a_String {
	public static int getCapitalWords(String inputstring) {
		int counter = 0;
		for (int i = 0; i < inputstring.length(); i++) {
			if (inputstring.charAt(i) >= 'A' && inputstring.charAt(i) <= 'Z') {
				counter++;
			}
		}
		return counter;

	}

	public static void main(String[] args) {
		System.out.println(getCapitalWords("HelloHiH"));
	}

}
