package HashMapSet;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetSTL {
    static void main() {
        HashSet<Integer> set = new HashSet<>();
        set.add(77);
        set.add(77); // duplicate: no effect on size as size counts distinct elements
        set.add(65);
        set.add(21);
        set.add(2);
        set.add(11);
        set.add(45);
        set.add(3);
        System.out.println(set.size()); // 7
        System.out.println(set.contains(3)); // true
        System.out.println(set.contains(4)); // false
        set.remove(2);
        System.out.println(set.size()); // 6
        System.out.println(set); // randomly ordered
        TreeSet<Integer> tree = new TreeSet<>(); // sorted ordered (prev line)
        for (int ele : set) System.out.println(ele + " ");
    }
}
