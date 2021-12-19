package Q1;
import java.io.*;
import java.util.*;

public class PivotInSortedRotatedArr {

  public static int findPivot(int[] arr) {
    //    Arrays.sort(arr);
    //    return arr[0];

    int lo = 0;
    int hi = arr.length - 1;

    while (lo < hi) {
      int mid = (lo + hi) / 2;
      if (arr[mid] < arr[hi]) hi = mid; else lo = mid + 1;
    }
    return arr[lo];
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int pivot = findPivot(arr);
    System.out.println(pivot);
  }
}
