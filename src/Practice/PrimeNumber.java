package Practice;

public class PrimeNumber {
	public static boolean findprimenumber(int num) {
		for (int i = 2; i < num; i++) {
			if (num % 2 == 0) {
				return false;

			}
		}

		return true;

	}
public static void getprimenumber(int num)
{
	for(int i=2;i<num;i++)
	{
		if(findprimenumber(i)) {
			System.out.println(i+ " ");
		}
	}
}
	public static void main(String[] args) {

		System.out.println(findprimenumber(10));
		getprimenumber(15);
	}
}
