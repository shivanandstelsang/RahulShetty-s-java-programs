package Practice;

public class FindSquareRoot {
	public static int findsquareroot(int num)
	{
		int t=0;
		int sqrtroot= num/2;
		do {
			t=sqrtroot;
			sqrtroot=(t+(num/t))/2;
		}while((t-sqrtroot)!=0);
		
		return sqrtroot;
		
	}

	public static void main(String[] args) {
		System.out.println(findsquareroot(1024));

	}

}
