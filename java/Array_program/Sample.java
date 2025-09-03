package Array_program;

import java.util.PriorityQueue;

public class Sample {
    public static void main(String[] args) {
        int arr[] = {1,3,5,6};
        int max=3;
        PriorityQueue<Integer> integers = new PriorityQueue<Integer>();
        
        for(int i=0; i<arr.length; i++) {
        	integers.add(arr[i]);
        	if(integers.size()>max) {
        		integers.poll();
        	}
        }
        System.out.println(integers.peek());
        
    }
}
