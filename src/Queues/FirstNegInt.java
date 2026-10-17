package Queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//in 12 -1 -7 8 -15 30 16 28 k = 3
//out -1 -1 -7 -15 -15 0
public class FirstNegInt {
    static Queue<Integer> FirstNegInt(int[] arr, int k) {
        Queue<Integer> q = new LinkedList<>();
        return q;
    }
    static Queue<Integer> FirstNegIntBruteForce(int arr[], int k) {
        Queue<Integer> ans = new LinkedList<>();
        int n = arr.length;
        int z = 0;
        for (int i = 0; i < n - k + 1; i++) {
            boolean found = false;
            for (int j = z; j < z + k; j++) {
                if (arr[j] < 0 && !found) {
                    ans.add(arr[j]);
                    found = true;
                }
            }
            z++;
            if (!found) ans.add(0);
        }
        return ans;
    }
    static void main() {
    }
}
