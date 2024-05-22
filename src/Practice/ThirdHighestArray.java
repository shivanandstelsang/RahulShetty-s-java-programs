package Practice;

public class ThirdHighestArray {
	public static int findlargestarray(int a[], int total) {
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 2];

	}

	public static void main(String[] args) {
		int a[] = { 9, 0, 1, 8, 7, 2, 6, 3, 4, 1, 5, 10 };
		System.out.println(findlargestarray(a, 12));
	}
}
