package Queues;

import java.util.NoSuchElementException;

public class MyQueue {
    ListNode head;
    ListNode tail;
    int size;
    MyQueue() {
        this.size = 0;
    }
    boolean isEmpty() {
        return size == 0;
    }
    void add(int x) {
        ListNode newNode = new ListNode(x);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        if (tail == null) {
            head.next = newNode;
            tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }
    int remove() {
        if (isEmpty()) throw new NoSuchElementException("Q is empty!");
        int x = head.value;
        head = head.next;
        if (head == null) tail = null;
        size--;
        return x;
    }
    int peek() {
        return head.value;
    }
    int size() {
        return size;
    }
    void display() {
        ListNode temp = head;
        System.out.print("[ ");

        while (temp != null) {
            System.out.print(temp.value);
            temp = temp.next;
            if (temp != null) {
                System.out.print(", ");
            }
        }

        System.out.print(" ]");
    }
}
