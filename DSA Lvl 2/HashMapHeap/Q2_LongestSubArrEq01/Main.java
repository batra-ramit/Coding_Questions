import java.util.*;

public class Main {

  public static int solution(int[] arr) {
    int max = Integer.MIN_VALUE;
    int sum = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, -1);
    for (int i = 0; i < arr.length; i++) {
      int val = arr[i];
      sum += (val == 0 ? -1 : 1);
      if (map.containsKey(sum)) {
        int idx = map.get(sum);
        if (i - idx > max) max = i - idx;
      } else map.put(sum, i);
    }

    return max;
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
