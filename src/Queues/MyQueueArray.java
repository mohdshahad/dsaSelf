package Queues;

import java.util.NoSuchElementException;

public class MyQueueArray {
    int size;
    int f;
    int r;
    int[] arr;
    MyQueueArray(int cap) {
        arr = new int[cap];
        f = 0;
        r = 0;
        this.size = 0;
    }
    boolean isFull() {
        return size == arr.length;
    }
    boolean isEmpty() {
        return size == 0;
    }
    void add(int x) {
        if (isFull()) throw new IllegalStateException("Q is Full!");
        arr[r++] = x;
        if (r == arr.length) {
            r = 0;
        }
        size++;
    }
    int remove() {
        if (isEmpty()) throw new NoSuchElementException("Q is Empty!");
        int x = arr[f];
        f++;
        if (f == arr.length) {
            f = 0;
        }
        size--;
        return x;
    }
    int peek() {
        if (isEmpty()) throw new NoSuchElementException("Q is Empty");
        return arr[f];
    }
    void display() {
        if (isEmpty()) throw new IllegalStateException("Q is Empty!");
        if (f < r) {
            for (int i = f; i < r; i++) {
                System.out.println(arr[i]);
            }
        }
        else {
            for (int i = f; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            for (int i = 0; i < r; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
