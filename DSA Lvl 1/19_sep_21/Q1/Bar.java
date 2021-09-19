import java.io.*;
import java.util.*;

public class Bar {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++)
      arr[i] = s.nextInt();

    int max = getmax(arr);
    for (int i = 0; i < max; i++) {
      for (int j = 0; j < n; j++) {
        if (max - arr[j] > i)
          System.out.print("\t");
        else
          System.out.print("*\t");
      }
      System.out.println();
    }



  }

  static int getmax(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max)
        max = arr[i];
    }
    return max;
  }

}