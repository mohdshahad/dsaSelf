package Stacks;

class MyStack {
        ListNode head;
        int len;
        int peek() {
            if (len == 0 || head == null) {
                System.out.println("Empty!");
                return -1;
            }
            return head.value;
        }

        int pop() {
            if (len == 0 || head == null) {
                System.out.println("Empty!");
                return -1;
            }
            int x = head.value;
            head = head.next;
            len--;
            return x;
        }

        void push(int ele) {
            ListNode newNode = new ListNode(ele);
            if (len == 0) {
                head = newNode;
            }
            else {
                newNode.next = head;
                head = newNode;
            }
            len++;
        }
        int size() {
            return len;
        }
        void display() {
            ListNode temp = head;
            while (temp != null) {
                System.out.println(temp.value);
                temp = temp.next;
            }
        }
    }