import java.util.*;

public class Main {

  public static boolean solution(int[] arr) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int val : arr) {
      if (map.containsKey(val)) map.put(val, map.get(val) + 1); else map.put(
        val,
        1
      );
    }
    Arrays.sort(arr);
    for (int val : arr) {
      if (map.get(val) == 0) {
        continue;
      } else if (map.containsKey(val * 2) && map.get(val * 2) != 0) {
        map.put(val, map.get(val) - 1);
        map.put(val * 2, map.get((val * 2)) - 1);
      } else if (
        map.containsKey(val / 2) && map.get(val / 2) != 0 && val % 2 == 0
        )
    //   odd no case like 5/2 karke it shoud not use freq of 2
        {
        map.put(val, map.get(val) - 1);
        map.put(val / 2, map.get((val / 2)) - 1);
      } else {
        return false;
      }
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
