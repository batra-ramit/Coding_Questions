import java.io.*;
import java.lang.*;
import java.util.*;

public class StringPermutations {

  public static void solution(String str) {
    int total = fac(str.length());
    int count = 0;
    while (count < total) {
      StringBuilder sb = new StringBuilder(str);
      int temp = count;
      while (sb.length() > 0) {
        int p = sb.length();
        int rem = temp % p;

        System.out.print(sb.charAt(rem));
        sb.deleteCharAt(rem);
        temp = temp / p;
      }
      count++;
      System.out.println();
    }
  }

  public static int fac(int n) {
    int mul = 1;
    for (int i = 1; i <= n; i++) mul = mul * i;

    return mul;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    solution(str);
  }
}
