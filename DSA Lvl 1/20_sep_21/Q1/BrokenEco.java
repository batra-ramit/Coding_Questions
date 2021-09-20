import java.io.*;
import java.util.*;

// Its a application of Binary Search

public class Brokenco {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++)
      arr[i] = s.nextInt();
    int elt = s.nextInt();
    int low = 0;
    int high = n - 1;
    int pos = -1;
    int mid = 0 ;
    while (low <= high) {
      mid = (low + high) / 2;
      if (arr[mid] < elt)
        low = mid + 1;
      else if (arr[mid] > elt)
        high = mid - 1;
      else {
        pos = mid;
        break;
      }
    }
    if (pos == -1) {
      if (arr[mid] > elt)
      { System.out.println(arr[mid]);
        System.out.println(arr[mid - 1]);
      }
      else
      {
        System.out.println(arr[mid + 1]);
        System.out.println(arr[mid]);
      }

    }
    else
      System.out.println(arr[mid]);
  }

}