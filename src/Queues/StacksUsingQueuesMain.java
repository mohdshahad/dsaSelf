package Queues;

public class StacksUsingQueuesMain {
    static void main() {
        StacksUsingQueues st = new StacksUsingQueues();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.size());
        System.out.println(st.pop());
        System.out.println(st.size());
        System.out.println(st.empty());
    }
}
