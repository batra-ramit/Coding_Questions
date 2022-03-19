import java.util.*;

public class Main {

  public static int solution(int[] arr) {
    int ans = 0;
    String str = "0#0";
    HashMap<String, Integer> map = new HashMap<>();
    int c0 = 0;
    int c1 = 0;
    int c2 = 0;
    map.put("0#0", 1);
    for (int val : arr) {
      if (val == 0) c0++; else if (val == 1) c1++; else c2++;

      str = (c1 - c0) + "#" + (c2 - c1);
      if (map.containsKey(str)) {
        int temp = map.get(str);
        ans += temp;
        map.put(str, ++temp);
      } else map.put(str, 1);
    }
    return ans;
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
