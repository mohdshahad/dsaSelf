package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class BasicsSTLOfQueues {
    static void main() {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q); /* [10, 20, 30] */
        q.remove(); /* [20, 30] */ /* int return type and returns peek */
        System.out.println(q.size()); /* 2 */
        System.out.println(q.peek()); /* 20 */
    }
}
