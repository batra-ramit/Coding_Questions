import java.io.*;
import java.util.*;

public class SortDates {

  public static void sortDates(String[] arr) {
    countSort(arr, 1000000, 100, 32);
    countSort(arr, 10000, 100, 13);
    countSort(arr, 1, 10000, 2501);

    print(arr);
  }

  public static void countSort(String[] arr, int div, int mod, int range) {
    int farr[] = new int[range];

    for (int i = 0; i < arr.length; i++) {
      int pos = (Integer.parseInt(arr[i]) / div) % mod;
      farr[pos]++;
    }

    for (int i = 1; i < farr.length; i++) {
      farr[i] = farr[i - 1] + farr[i];
    }

    String ans[] = new String[arr.length];
    for (int i = arr.length - 1; i >= 0; i--) {
      int pos = (Integer.parseInt(arr[i]) / div) % mod;

      int cal = farr[pos];

      farr[pos]--;

      ans[cal - 1] = arr[i];
    }

    for (int i = 0; i < arr.length; i++) {
      arr[i] = ans[i];
    }
  }

  public static void print(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    String[] arr = new String[n];
    for (int i = 0; i < n; i++) {
      String str = scn.next();
      arr[i] = str;
    }
    sortDates(arr);
  }
}
