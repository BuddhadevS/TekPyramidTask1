package StringProgram;

import java.util.PriorityQueue;
public class ThirdMaxWithoutSort {
	

	    public static void main(String[] args) {
	        int[] arr = {5, 1, 9, 3, 7, 4, 12, 9};
	        int k =2;

	        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	        for (int i=0; i<arr.length; i++) {
	        	pq.add(arr[i]);
	            if (pq.size() > k) {
	                pq.poll();
	            }
	        }
	        
	        
	      System.out.println("3rd maximum: " + pq.peek());
	    }
	}
