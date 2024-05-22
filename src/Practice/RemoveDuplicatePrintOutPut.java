package Practice;

public class RemoveDuplicatePrintOutPut {
	public static void main(String[] args) {

		String str = "AUTOMATION";
		String rev = "";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (rev.indexOf(ch) < 0) {
				rev = rev + ch;
				count++;
			}

		}
		System.out.println(" After Removing The Duplicates : " + rev);
		System.out.println(" After The Removation of The Dup_Chars : " + count);

	}
}