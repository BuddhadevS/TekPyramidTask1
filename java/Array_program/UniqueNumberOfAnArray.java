package Array_program;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueNumberOfAnArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 1, 2 };
		Set<Integer> integers = new LinkedHashSet<Integer>();
		for(int i=0; i<arr.length; i++) {
			integers.add(arr[i]);
		}
		System.out.println(integers);
	}

}
