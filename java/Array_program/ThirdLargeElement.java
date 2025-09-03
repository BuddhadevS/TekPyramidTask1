package Array_program;

import java.util.Arrays;
import java.util.PriorityQueue;

public class ThirdLargeElement {
	public static void main(String[] args) {
		int arr[]  = {1,10,20,15,12,13,21};
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i]<arr[j]) {
//					arr[i]  =arr[i]+arr[j];
//					arr[j]  =arr[i]-arr[j];
//					arr[i]  =arr[i]-arr[j];
//				}
//			}
//		}
//		System.out.println(arr[2]);
		
		int max = 3;
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for(int i=0; i<arr.length; i++) {
			queue.add(arr[i]);
			if(queue.size()>max) {
				queue.poll();
			}
		}
		System.out.println(queue.peek());
		
	}

}
