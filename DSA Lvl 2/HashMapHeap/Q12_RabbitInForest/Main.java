import java.util.*;

public class Main {

  public static int solution(int[] answers) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int val : answers) {
      if (map.containsKey(val)) {
        map.put(val, map.get(val) + 1);
      } else map.put(val, 1);
    }
    int sum = 0;

    for (int key : map.keySet()) {
      if (key == 0) {
        sum += map.get(key);
      } else {
        int o = key + 1;
        int f = map.get(key);
        int a = (int) Math.ceil((f * 1.0) / (o * 1.0)) * o;
        sum += a;
      }
    }
    return sum;
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
