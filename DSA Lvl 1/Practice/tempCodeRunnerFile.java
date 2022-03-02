import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] routes = new int[n];
    for (int i = 0; i < n; i++) routes[i] = sc.nextInt();

    Integer[] str = new Integer[n + 1];
    paths(n, routes, str);
    System.out.println(str[0]);

    for (int i = 0; i <= n; i++) System.out.println(str[i]);
  }

  static void paths(int n, int[] routes, Integer[] str) {
    str[n] = 0;
    for (int i = n - 1; i >= 0; i--) {
      for (int step = 1; step <= routes[i]; step++) {
        if (str[i + step] == null) {
          
        } else if (str[i] == null && (i + step) <= n && str[i + step] != null) {
          str[i] = str[i + step] + 1;
          System.out.println("here"+i+step);
        } else if (i + step <= n && str[i] != null && str[i + step] != null) {
          str[i] = Math.min(str[i], (str[i + step] + 1));
        }
      }
    }
  }
}
