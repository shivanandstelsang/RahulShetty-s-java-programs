package RahulShettyAcademy_Practice;

public class WriteaJavaProgramtoswaptwogivenStrings {
	public static void main(String[] args) {
		String x = "Hard";
		String y = "work";
		System.out.println("before swapping : " + x + " " + y);
		x = x + y;
		y = x.substring(0, x.length() - y.length());
		x = x.substring(y.length());
		System.out.println("after swapping : " + x + " " + y);
	}
}
