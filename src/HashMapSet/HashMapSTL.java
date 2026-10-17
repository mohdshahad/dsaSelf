package HashMapSet;

import java.util.HashMap;

public class HashMapSTL {
    static void main() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Raghav", 25);
        map.put("Abhinav", 19);
        map.put("Vivek", 17);
        map.put("Deepika", 19);
        System.out.println(map); // {Raghav=25, Vivek=17, Deepika=25, Aditya=19} key=value
        System.out.println(map.size()); // 4
        // map.remove(19); // can't remove by value but key
        System.out.println(map.get("Raghav"));// 25
        System.out.println(map.remove("Deepika")); // prints 20(value) and remove
        System.out.println(map.size()); // 3
        map.put("Deepika", 20);
        System.out.println(map); // overwrite value of deepika from 19 to 20
        System.out.println(map.containsKey("Daniel")); // false
        for(String key : map.keySet()){ // traverse
            System.out.println(key+"="+map.get(key));
        }
    }
}
