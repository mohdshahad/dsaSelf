package Queues;

import java.util.NoSuchElementException;
import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> helperStack = new Stack<>();
    void push(int x) { // O(1)
        mainStack.push(x);
    }
    int remove() { // O(n)
        if (mainStack.empty()) throw new NoSuchElementException("Q is Empty!");
        while ((mainStack.size() > 1)) helperStack.push(mainStack.pop());
        int x = mainStack.pop();
        while (!helperStack.empty()) mainStack.push(helperStack.pop());
        return x;
    }
    int peek() {
        if (mainStack.empty()) throw new NoSuchElementException("Q is Empty!");
        while ((mainStack.size() > 1)) helperStack.push(mainStack.pop());
        int x = mainStack.peek();
        while (!helperStack.empty()) mainStack.push(helperStack.pop());
        return x;
    }
    int size() {
        return mainStack.size();
    }
}
