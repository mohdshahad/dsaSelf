package Stacks;

import java.util.Stack;

public class BasketBall {
    static int callPoints(String[] arr) {
        // c -> pop
        // d -> insert 2*peek()
        // + -> add last two(top)
        // at last pop and find sum of all
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            String s = arr[i];
            if (s.equals("C")) {
                st.pop();
            }
            else if (s.equals("D")) {
                st.push(2 * st.peek());
            }
            else if (s.equals("+")) {
                int a = st.pop();
                int b = st.peek();
                int c = a + b;
                st.push(a);
                st.push(c);
            }
            else st.push(Integer.parseInt(s));
        }
        int sum = 0;
        while (!st.empty()) sum += st.pop();
        return sum;
    }
}
