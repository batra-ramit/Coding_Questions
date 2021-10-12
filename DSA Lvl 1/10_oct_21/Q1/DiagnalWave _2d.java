import java.io.*;
import java.util.*;

public class DiagnalWave_2d {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[][] = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) arr[i][j] = sc.nextInt();
    }
    int js = 0;
    int jfin = 0;
    int is = n - 1;
    int ifin = n - 1;
    int count = 0;
    int maxDiag = 2 * n - 1;
    while (count < maxDiag) {
      printdiagnal(arr, is, js, ifin, jfin, count);
      // System.out.println(is+" "+js+" "+ifin+" "+jfin+" "+count);
      count++;
      if (count < n) {
        is--;
        jfin++;
      } else {
        js++;
        ifin--;
      }
    }
  }

  public static void printdiagnal(
    int[][] arr,
    int is,
    int js,
    int ifin,
    int jfin,
    int count
  ) {
    if (count % 2 == 0) {
      for (
        int i = is, j = js;
        i <= ifin && j <= jfin;
        i++, j++
      ) System.out.println(arr[i][j]);
    } else {
      for (
        int i = ifin, j = jfin;
        i >= is && j >= js;
        i--, j--
      ) System.out.println(arr[i][j]);
    }
  }
}
