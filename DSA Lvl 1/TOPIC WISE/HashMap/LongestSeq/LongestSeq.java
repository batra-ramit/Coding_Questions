

import java.io.*;
import java.util.*;

public class LongestSeq {


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = -1;
        int maxS = -1;
        HashMap<Integer, Boolean> map = new HashMap<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            map.put(arr[i], true);
        }

        for (int val : arr) {
            if (map.containsKey(val - 1) == true)
                map.put(val, false);
        }
        for (int val : arr) {
            if (map.get(val) == true) {
                int freq = 1;
                while (map.containsKey(val + freq) == true)
                    freq++;

                if (freq > max) {
                    max = freq;
                    maxS = val;
                }
            }

        }
        for (int i = maxS; i < maxS + max; i++) {
            System.out.println(i);
        }
    }

}

