package StringProgram;
import java.util.PriorityQueue;
public class SortWithOutSortingAlgo {
	public static void main(String[] args) {
        int[] arr = {5, 1, 9, 3, 7, 12, 4};
        int k = 3; // Find the 3 largest elements

        // Min-heap of size k
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for (int num : arr) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll();    // remove the smallest
            }
        }
        System.out.println(pq);
        
	}
}
