package HashMapSet;

import java.util.HashSet;

public class FindDistinctElements {
    static void main() {
        int[] arr = {1, 2, 2, 4, 7};
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set.size()); // 4
    }
}
