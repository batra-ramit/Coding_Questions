import java.util.*;

public class Main {

  public static boolean solution(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int smallest = arr[0];
    map.put(smallest, 1);
    for (int i = 1; i < arr.length; i++) {
      if (map.containsKey(arr[i])) map.put(
        arr[i],
        map.get(arr[i]) + 1
      ); else map.put(arr[i], 1);

      if (smallest > arr[i]) smallest = arr[i];
    }
    int ss = Integer.MAX_VALUE;
    if (map.get(smallest) > 1) ss = smallest; else {
      for (int val : arr) {
        if (val != smallest && val < ss) ss = val;
      }
    }
    int d = ss - smallest;
    for (int j = 0; j < arr.length; j++) {
      if (map.containsKey(smallest + (j * d))) {
        map.put(smallest + (j * d), map.get(smallest + (j * d)) - 1);
      }
    }
    for (int key : map.keySet()) {
      if (map.get(key) != 0) return false;
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    System.out.println(solution(arr));
  }
}
