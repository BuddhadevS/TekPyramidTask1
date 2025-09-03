package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumbers {
	
	public static void generateBinary(int N) {
        Queue<String> q = new LinkedList<String>();
        q.add("1");

        for (int i = 1; i <= N; i++) {
            String curr = q.remove();
            System.out.print(curr + " ");

            q.add(curr + "0");
            q.add(curr + "1");
        }
    }
    public static void main(String[] args) {
        int N = 5;
        System.out.println("Binary numbers from 1 to " + N + ":");
        generateBinary(N);
    }

}
