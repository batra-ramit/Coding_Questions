import java.io.*;
import java.util.*;

public class LargestNum {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    for (int l = 0; l < t; l++) {
      int n = sc.nextInt();
      int arr[] = new int[n];

      for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

      int max = arr[0];
      int pos = 0;
      for (int i = n - 1; i >= 0; i--) {
        if (arr[i] > max) {
          max = arr[i];
          pos = i;
        }
      }

      if (pos != 0 || arr.length==1) {
        int temp = arr[0];
        arr[0] = arr[pos];
        arr[pos] = temp;
      } else {
        int left = 0, right = n - 1;
        int nextmax = -1;
        int npos = -1;

        while (left<arr.length) {
          right = n - 1;
          nextmax = -1;
          
          
          for (int j = right; j >= left; j--) {
            if (arr[j] > arr[left] && arr[j] > nextmax) {
              nextmax = arr[j];
              npos = j;
            }
          }
          
          // System.out.println(left + "\t" + right);
          if (nextmax > arr[left]) {
            int temp = arr[npos];
            arr[npos] = arr[left];
            arr[left] = temp;
            break;
        } else
        {
            left++;
        }
        }
      }

      for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
      }System.out.println();
    }
  }
}
