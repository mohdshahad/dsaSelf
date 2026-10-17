package HashMapSet;

import java.util.HashSet;
//arr[] = {1, 4, 1, 4, 5}
//k = 3
// output = 4
//explaination {1, 4} {1, 4} {4,1} {1, 4}
public class PairsWithDifferenceK {
    public static int countPairs(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int ele : arr) set.add(ele);
        int count = 0;
        for (int ele : set) {
            if (set.contains(ele - k)) count++;
            else if (set.contains(ele + k)) count++;
        }
        return count;
    }

    static void main() {
        int[] arr = {1, 4, 1, 4, 5};
        int k = 3;
        System.out.println(countPairs(arr, k));
    }
}
