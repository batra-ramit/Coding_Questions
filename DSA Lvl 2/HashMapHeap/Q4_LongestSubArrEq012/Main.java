import java.util.*;

public class Main {

  public static int solution(int[] arr) {
    int max = 0;
    String str = "0#0";
    HashMap<String, Integer> map = new HashMap<>();
    map.put(str, -1);
    int c0 = 0, c1 = 0, c2 = 0;
    for (int i = 0; i < arr.length; i++) {
      int val = arr[i];
      if (val == 0) c0++; else if (val == 1) c1++; else c2++;
      str = (c1 - c0) + "#" + (c2 - c1);
      if (map.containsKey(str)) {
        int idx = map.get(str);
        if (i - idx > max) max = i - idx;
      } else map.put(str, i);
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
