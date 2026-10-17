package HashMapSet;
// a[] = {11, 7, 1, 13, 21, 3, 7, 3}
// b[] = {11, 3, 7, 1, 7}
// b is a subset of a

import java.util.HashSet;

public class ArraySubset {
    boolean isSubset(int a[], int b[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            if (!set.contains(b[i])) return false;
        }
        return true;
    }
}
