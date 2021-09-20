

import java.io.*;
import java.util.*;

public class FirsLastIndex  {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++)
      arr[i] = s.nextInt();
    int d = s.nextInt();

    int low = 0;
    int high = n - 1;
    int mid = 0, fi = -1;

    while (low <= high) {
      mid = (low + high) / 2;
      if (arr[mid] > d)
        high = mid - 1;
      else if (arr[mid] < d)
        low = mid + 1;
      else {
        fi = mid;
        high = mid - 1;
      }

    }
    
    
    low = 0;
    high = n - 1;
    mid = 0;
    int li = -1;

    while (low <= high) {
      mid = (low + high) / 2;
      if (arr[mid] > d)
        high = mid - 1;
      else if (arr[mid] < d)
        low = mid + 1;
      else {
        li = mid;
        low = mid + 1;
      }

    }

    System.out.println(fi);
    System.out.println(li);
  }}
    
    
    
    