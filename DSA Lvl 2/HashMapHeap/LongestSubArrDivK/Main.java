import java.util.*;

public class Main {

  public static int solution(int[] arr, int k) {
    int sum = 0;
    int max = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, -1);
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      int rem = sum % k;
      if (rem < 0) rem += k;

      if (map.containsKey(rem)) {
        int idx = map.get(rem);
        if (i - idx > max) max = i - idx;
      } else map.put(rem, i);
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
    int k = scn.nextInt();
    System.out.println(solution(arr, k));
  }
}
