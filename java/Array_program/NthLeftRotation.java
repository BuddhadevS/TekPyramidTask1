package Array_program;

import java.util.Arrays;
import java.util.Scanner;

public class NthLeftRotation {
	private static void rotation(int[] arr) {
		
		int first = arr[0];
		for(int i=0; i<arr.length-1; i++) {
			arr[i]  =arr[i+1];
		}
		arr[arr.length-1]=first;	
	}
	public static void main(String[] args) {
		int arr []= {1,2,3,4,5,6};
		System.out.println("Before the right rotation "+Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int no = sc.nextInt();
		for(int i=0; i<no; i++) {
			rotation(arr);
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
