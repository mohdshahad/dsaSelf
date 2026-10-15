package Stacks;
import java.util.Stack;

public class RemoveConsecutiveCharacters {
    static void main() {
        Stack<Character> mainStack = new Stack<>();
        Stack<Character> helperStack = new Stack<>();
        String s = "aaaavvvvfdffffssssaaa"; // expected output avfdfsa
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
//            if (mainStack.empty() || mainStack.peek() != ch) {
//                mainStack.push(ch);
//            }
//            if (!mainStack.empty()) {
//                if (mainStack.peek() == ch) {
//                    continue;
//                }
//            }
            if (!mainStack.empty() && mainStack.peek() == ch) {
                continue;
            }

            mainStack.push(ch);
        }
        while (!mainStack.empty()) helperStack.push(mainStack.pop());
        String out = "";
        while (!helperStack.empty()) out += helperStack.pop();
        System.out.print(out);
    }
}
