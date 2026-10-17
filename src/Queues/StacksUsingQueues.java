package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class StacksUsingQueues {
    Queue<Integer> q = new LinkedList<>();
    void push(int value) {
        q.add(value);
    }
    boolean empty() {
        return q.size() == 0;
    }
    int pop() {
        int n = q.size();
        for (int i = 0; i < n - 1; i++) {
            q.add(q.remove());
        }
        int x = q.remove();
        return x;
    }
    int size() {
        return q.size();
    }
    int top() {
        int n = q.size();
        for (int i = 0; i < n - 1; i++) {
            q.add(q.remove());
        }
        int x = q.peek();
        q.add(q.remove());
        return x;
    }
}
