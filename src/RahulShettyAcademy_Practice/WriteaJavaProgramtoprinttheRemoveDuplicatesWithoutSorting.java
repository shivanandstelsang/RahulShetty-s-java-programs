package RahulShettyAcademy_Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class WriteaJavaProgramtoprinttheRemoveDuplicatesWithoutSorting {
	public static void removeDuplicates(int a[]) {
		HashSet set = new HashSet();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		ArrayList list = new ArrayList(set);
		Collections.sort(list);
		//Collections.reverse(list);
		System.out.println(list);
	}

	public static void main(String[] args) {
		int a[] = { 3, 9, 0, 7, 1, 8, 2, 6, 4, 5 };
		removeDuplicates(a);
	}
}