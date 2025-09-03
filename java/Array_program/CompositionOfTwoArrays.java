package Array_program;

public class CompositionOfTwoArrays {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int[] arr2 = { 2, 5, 3, 6 };
		int brr[] = new int[Math.min(arr.length, arr2.length)];
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr2.length; j++) {

				if (arr[i] == arr2[j]) {
					brr[index] = arr[i];
					index++;
					break;

				}
			}
		}
		System.out.println("Common elements:");
        for (int i = 0; i < index; i++) {  // print only till found elements
            System.out.println(brr[i]);
            
        }

	}
}
