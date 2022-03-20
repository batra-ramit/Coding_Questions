import java.util.*;

public class Main {

  public static int solution(int[] arr, int k) {
    int ans = 0;
    int sum = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(sum, 1);
    for (int val : arr) {
      sum = sum + val;

      int temp = 0;
      if (sum < 0 && sum % k != 0) temp = (sum % k) + k; else temp = (sum % k);

      if (map.containsKey(temp)) {
        ans = ans + map.get(temp);
        map.put(temp, map.get(temp) + 1);
      } else map.put(temp, 1);
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
    int k = scn.nextInt();
    System.out.println(solution(arr, k));
  }
}
