import java.io.*;
import java.util.*;

public class RingRotate {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int arr[][] = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) arr[i][j] = sc.nextInt();
    }

    int s = sc.nextInt();
    int r = sc.nextInt();

    int minr = s - 1;
    int minc = s - 1;
    int maxr = n - s;
    int maxc = m - s;

    if (minr == maxr) {
        int maxElts = maxc - minc + 1;
        int[] OnedArr = new int[maxElts];
        int count = 0;
        for (int i = minr, j = minc; j <= maxc && count < maxElts; j++, count++)
            OnedArr[count] = arr[i][j];

        rotate(OnedArr, r);
        count = 0;
        for (int i = minr, j = minc; j <= maxc && count < maxElts; j++, count++)
            arr[i][j] = OnedArr[count];
    }
    
    else {
      int maxElts = 2 * (maxc - minc + 1) + 2 * (maxr - minr + 1) - 4;

      // System.out.println(s+" "+r+" "+minr+" "+minc+" "+maxr+" "+maxc+" "+maxElts);
      int[] OnedArr = new int[maxElts];

      Make1dArr(s, OnedArr, arr, minr, maxr, minc, maxc);
      // for(int i=0;i<OnedArr.length;i++)
      // System.out.println(OnedArr[i]);
      rotate(OnedArr, r);
      //  System.out.println();
      //  for(int i=0;i<OnedArr.length;i++)
      // System.out.println(OnedArr[i]);
      Make2dArr(OnedArr, s, arr, minr, maxr, minc, maxc);
    }
    display(arr);
  }

  public static void Make1dArr(
    int s,
    int[] OnedArr,
    int[][] arr,
    int minr,
    int maxr,
    int minc,
    int maxc
  ) {
    int maxElts = 2 * (maxc - minc + 1) + 2 * (maxr - minr + 1) - 4;

    int count = 0;
    while (count < maxElts) {
      for (int i = minr, j = minc; i <= maxr; i++, count++) OnedArr[count] =
        arr[i][j];
      minc++;
      for (int i = maxr, j = minc; j <= maxc; j++, count++) OnedArr[count] =
        arr[i][j];
      maxr--;
      for (int i = maxr, j = maxc; i >= minr; i--, count++) OnedArr[count] =
        arr[i][j];
      maxc--;
      for (int i = minr, j = maxc; j >= minc; j--, count++) OnedArr[count] =
        arr[i][j];
    }
  }

  public static void rotate(int[] arr, int r) {
    r = r % arr.length;
    if (r < 0) r += arr.length;
    reverse(arr, 0, arr.length - r - 1);
    reverse(arr, arr.length - r, arr.length - 1);
    reverse(arr, 0, arr.length - 1);
  }

  public static void reverse(int[] arr, int left, int right) {
    while (left < right) {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }
  }

  public static void Make2dArr(
    int[] OnedArr,
    int s,
    int[][] arr,
    int minr,
    int maxr,
    int minc,
    int maxc
  ) {
    int maxElts = 2 * (maxc - minc + 1) + 2 * (maxr - minr + 1) - 4;

    int count = 0;
    while (count < maxElts) {
      for (int i = minr, j = minc; i <= maxr; i++, count++) arr[i][j] =
        OnedArr[count];
      minc++;
      for (int i = maxr, j = minc; j <= maxc; j++, count++) arr[i][j] =
        OnedArr[count];
      maxr--;
      for (int i = maxr, j = maxc; i >= minr; i--, count++) arr[i][j] =
        OnedArr[count];
      maxc--;
      for (int i = minr, j = maxc; j >= minc; j--, count++) arr[i][j] =
        OnedArr[count];
    }
  }

  public static void display(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
