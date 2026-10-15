package Stacks;

import java.util.Stack;

public class BalancedParanthesis {
    static boolean main() {
        Stack<Character> st = new Stack<>();

        String s = "(({}[]()))";

        int n = s.length();

        if (isinvalid(s)) return false;

        if (n % 2 == 1) return false;

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            if (openingBracket(ch)) {
                st.push(ch);
            }
            else {
                if (st.empty()) return false;

                char top = st.peek();

                if (isSame(top, ch)) {
                    st.pop();
                }

                else return false;
            }
        }
        return (st.isEmpty());
    }
    static boolean openingBracket(char ch) {
        return (ch == '{' || ch == '[' || ch == '(');
    }
    static boolean isSame(char a, char b) {
    return (
                    a == '{' && b == '}' ||
                    a == '[' && b == ']' ||
                    a == '(' && b == ')'
            );
    }
    static boolean isinvalid(String s) {
        for (int i = 0; i<s.length(); i++) {
            char a = s.charAt(i);
            if ( a != '(' && a != '[' && a != '{' && a != ')' && a != ']' && a != '}') {
                return true;
            }
        }
        return false;
    }
}
