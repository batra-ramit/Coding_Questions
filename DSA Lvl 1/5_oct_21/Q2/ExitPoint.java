import java.io.*;
import java.util.*;

public class ExitPoint {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int m = s.nextInt();

    int arr[][] = new int[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = s.nextInt();
      }
    }
    int i = 0, j = 0, dir = 0;
    
    dir = arr[i][j];
    while (true) {
    //   System.out.println(i + "\t" + j);
      if (dir % 4 == 0 ) {
        j++;
      } else if (dir % 4 == 1) {
        i++;
      } else if (dir % 4 == 2) {
        j--;
      } else {
        i--;
    } 
      if(i < n && j < m && i >= 0 && j >= 0)
      dir = dir + arr[i][j];
    else
        break;
    }

    if (i == n) {
      System.out.println(--i +"\n"+ j);
    } else if (j == m) {
      System.out.println(i +"\n"+ --j);
    } else if (j == -1) {
      System.out.println(i +"\n"+ ++j);
    } else {
        System.out.println(++i + "\n" + j);
    }
  }
}
