package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueTraversal {
    static void main() {
        Queue<Integer> q = new LinkedList<>();
        int n = q.size();
    }

    void addAtIdx(int value, int idx, Queue<Integer> q) {
        if (idx < 0 || idx > q.size()) return;
        int n = q.size();

        for (int i = 0; i < idx; i++) {
            q.add(q.remove());
        }
        q.add(value);

        for (int j = 0; j < n - idx; j++) {
            q.add(q.remove());
        }
    }

    void Display(Queue<Integer> q) {
        int n = q.size();
        for (int i = 0; i < n; i++) {
            System.out.println(q.peek() + " ");
            q.add(q.remove());
        }
    }

    void Traversal(Queue<Integer> q) {
        int n = q.size();
        for (int i = 0; i < n; i++) {
            System.out.println(q.peek() + " ");
            q.add(q.remove());
        }
    }

    int peek(Queue<Integer> q, int idx) {
        if (idx < 0 || idx >= q.size()) {
            throw new IndexOutOfBoundsException();
        }
        int y = -1;
        int n = q.size();
        for (int i = 0; i < idx; i++) {
            q.add(q.remove());
        }
        y = q.remove();
        q.add(y);
        for (int j = 0; j < n - idx -1; j++) {
            q.add(q.remove());
        }
        return y;
    }

    int remove(Queue<Integer> q, int idx) {
        if (idx < 0 || idx >= q.size()) {
            throw new IndexOutOfBoundsException();
        }
        int n = q.size();

        for (int i = 0; i < idx; i++) {
            q.add(q.remove());
        }
        int az = q.remove();
        for (int j = 0; j < n - idx - 1; j++) {
            q.add(q.remove());
        }
        return az;
    }

    void reverse(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        int n = q.size();

        for (int i = 0; i < n; i++) {
            s.push(q.remove());
        }

        while (!s.empty()) {
            q.add(s.pop());
        }
    }

    void reverseFirstK(Queue<Integer> q, int k) {

        Stack<Integer> s = new Stack<>();
        int n = q.size();
        if (k < 0 || k > n) {
            throw new IllegalArgumentException("Invalid k");
        }

        for (int i = 0; i < k; i++) {
            s.push(q.remove());
        }

        while (!s.empty()) {
            q.add(s.pop());
        }

        for (int i = 0; i < n - k; i++) {
            q.add(q.remove());
        }
    }

    int circularGameWinner(Queue<Integer> q, int k) {
        if (q.isEmpty()) return -1;
        if (q.size() == 1) return q.peek();
        if (k > q.size()) k = k % q.size();
        while (q.size() != 1) {
            for (int i = 0; i < k - 1; i++) {
                q.add(q.remove());
            }
            q.remove();
        }
        return q.peek();
    }
}