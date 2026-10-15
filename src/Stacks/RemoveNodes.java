package Stacks;
import java.util.Stack;

// remove nodes from the linked list which has higher value in right of the linked list
public class RemoveNodes {
    public ListNode RemoveNodes(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            if (st.empty()) {
                st.push(temp); // 1st iter
            }
            else { // 2nd iter and onwards and not empty
                if (temp.value <= st.peek().value) { // not empty and temp < peek (simply push)
                    st.push(temp);
                }
                else { // not empty but temp > peek , simply pop all less than temp;
                    while (temp.value > st.peek().value) {
                        st.pop();
                    }
                    st.push(temp);
                }
            }
            temp = temp.next;
        }
        while (!st.empty()) {
            ListNode top = st.pop();
            top.next = temp;
            temp = top;
        }
        return temp;
    }
}
