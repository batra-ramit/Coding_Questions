import java.util.*;
import java.util.Scanner;
import java.util.function.Function;

public class TargetSumPairUsingBinarySearch {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 5;
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int value = sc.nextInt();
    Arrays.sort(arr);
    for (int i = 0; i < n; i++) {
      int search = value - arr[i];
      if (search <= arr[i]) break;
      if (binsearch(search, arr) == true) {
        System.out.println(arr[i] + "\t" + search);
      }
    }
  }

  public static boolean binsearch(int n, int[] arr) {
    int l = 0, r = arr.length - 1, m = (l + r) / 2;
    while (l <= r) {
      if (n < arr[m]) r = m - 1; else if (n > arr[m]) l = m + 1; else if (
        n == arr[m]
      ) return true;
      m = (l + r) / 2;
    }
    return false;
  }
}
