import java.io.*;
import java.util.*;

public class Main {

  public static boolean hasGroupsSizeX(int[] deck) {
    int ans = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int val : deck) {
      if (map.containsKey(val)) map.put(val, map.get(val) + 1); else map.put(
        val,
        1
      );
    }

    int gcd = 1;
    int counter = 0;
    for (int set : map.keySet()) {
      if (counter == 0) gcd = map.get(set); else {
        gcd = GetGCD(gcd, map.get(set));
      }
      counter++;
    }
    return gcd > 1;
  }

  public static int GetGCD(int n1, int n2) {
    while (n1 % n2 != 0) {
      int rem = n1 % n2;
      n1 = n2;
      n2 = rem;
    }
    return n2;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(hasGroupsSizeX(arr));
  }
}
