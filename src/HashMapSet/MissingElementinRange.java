package HashMapSet;

import Queues.MyQueueLL;

import java.util.ArrayList;
import java.util.HashSet;

public class MissingElementinRange {
    static void main() {
        MyQueueLL q = new MyQueueLL();
        HashSet<Integer> set = new HashSet<>();
        // [10, 12, 11, 15] low = 10 high = 15 out = [13, 14]
        int[] arr = {10, 12, 11, 15};
        int low = 10;
        int high = 15;
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (int i = low + 1; i < high; i++) {
            if (set.contains(i)) continue;
            q.add(i);
        }
        q.display();
    }
    ArrayList<Integer> secWay(int[] arr, int low, int high) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            ans.add(arr[i]);
        }
        for (int i = low + 1; i < high; i++) {
            if (set.contains(i)) continue;
            ans.add(i);
        }
        return ans;
    }
}
