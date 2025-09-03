package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class StakUsingQueue {
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    // Push element (O(1))
    void push(int x) {
        q1.add(x);
    }

    // Pop element (O(n))
    int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        // Move all except last from q1 to q2
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        // Last element is the stack's pop
        int popped = q1.remove();

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return popped;
    }
}

class Main {
    public static void main(String[] args) {
        StakUsingQueue st = new StakUsingQueue();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.pop()); // 30
        System.out.println(st.pop()); // 20
        System.out.println(st.pop()); // 10
        System.out.println(st.pop()); // Stack empty → -1
    }
}
