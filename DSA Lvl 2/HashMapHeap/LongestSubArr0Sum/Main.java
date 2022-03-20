import java.util.*;

public class Main {

  public static int solution(int[] arr) {
    int sum = 0;
    int max = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, -1);

    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];

      if (map.containsKey(sum)) {
        int idx = map.get(sum);
        if (i - idx > max) max = i - idx;
      } else map.put(sum, i);
    }

    return max;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int[] arr = new int[scn.nextInt()];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
    }
    System.out.println(solution(arr));
  }
}
