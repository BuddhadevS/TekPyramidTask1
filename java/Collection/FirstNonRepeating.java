package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeating {
	
	public static void main(String[] args) {
        String stream = "aabc";
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<Character>();
        
        for (char ch : stream.toCharArray()) {
            freq[ch - 'a']++;
            q.add(ch);

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            System.out.print(q.isEmpty() ? "-1 " : q.peek() + " ");
        }
	}
}
