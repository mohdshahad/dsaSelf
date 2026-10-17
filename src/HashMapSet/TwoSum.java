package HashMapSet;

import java.util.HashSet;

public class TwoSum {
    boolean TwoSum(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (set.contains(complement)) return true;
            set.add(arr[i]);
        }
        // {1, 2, 3, 4, 5}
        return false;
    }
}
