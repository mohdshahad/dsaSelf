package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// 1 2 3 4 5 6 7 8 -> 1 5 2 6 3 7 4 8
public class RearrangeQueue {

    static Queue<Integer> RearrangeQueue(Queue<Integer> q) {
        Queue<Integer> firstHalf = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        int n = q.size();
        int k = n / 2;

        // Store the first half
        for (int i = 0; i < k; i++) {
            firstHalf.add(q.remove());
        }

        // Reverse the first half using a stack
        while (!firstHalf.isEmpty()) {
            stack.push(firstHalf.remove());
        }

        // Restore the original order
        while (!stack.isEmpty()) {
            firstHalf.add(stack.pop());
        }

        // Interleave both halves
        for (int i = 0; i < k; i++) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }

        return q;
    }
//        Queue<Integer> ans = new LinkedList<>();
//
//        int n = q.size();
//        int k = n / 2;
//
//        for (int i = 0; i < k; i++) {
//            int a = q.remove();
//
//            for (int p = 0; p < k - 1; p++) {
//                q.add(q.remove());
//            }
//
//            int b = q.remove();
//
//            ans.add(a);
//            ans.add(b);
//
//            for (int p = 0; p < n - k - 1; p++) {
//                q.add(q.remove());
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            q.remove();
//        }
//        for (int i = 0; i < n; i++) {
//            q.add(ans.remove());
//        }
//        return q;
//    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < 8; i++) {
            q.add(i+1);
        }
        Queue<Integer> a = RearrangeQueue(q);
        System.out.println(a);
    }
}
