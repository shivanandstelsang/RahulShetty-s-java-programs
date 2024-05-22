package Re_Practice;

public class OccurancesOfString {

	public static void main(String[] args) {
		String s = "PLAYBOLD";
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (res.indexOf(ch) < 0) {
				res = res + ch;
			}
		}
		System.out.println(res);
		for (int i = 0; i < res.length(); i++) {
			char ch = res.charAt(i);
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if (ch == s.charAt(j)) {
					count++;
				}
			}
			System.out.println(ch + " " + "occurances" + " " + count + " " + "times(s)");

		}
	}
}