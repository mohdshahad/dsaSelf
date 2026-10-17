package Queues;

import java.util.NoSuchElementException;

public class MyQueueLL {
    ListNode head;
    ListNode tail;
    int size;
    public MyQueueLL() {
        this.size = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void add(int x) {
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
    public int remove() {
        if (isEmpty()) throw new NoSuchElementException("Q is empty!");
        int x = head.value;
        head = head.next;
        if (head == null) tail = null;
        size--;
        return x;
    }
    public int peek() {
        return head.value;
    }
    public int size() {
        return size;
    }
    public void display() {
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
