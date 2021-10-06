import java.io.*;
import java.util.*;

public class SpiralDisp {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int n1 = s.nextInt();
    int m1 = s.nextInt();
    int a[][] = new int[n1][m1];
    for (int i = 0; i < n1; i++) {
      for (int j = 0; j < m1; j++) a[i][j] = s.nextInt();
    }

    int maxr = a.length - 1, maxc = a[0].length - 1, minr = 0, minc = 0;
    int maxcount = n1 * m1, count = 0;

    while (count < maxcount) {
      for (int i = minr, j = minc; i <= maxr && count < maxcount; i++) {
        System.out.println(a[i][j]);
        count++;
      }
      minc++;

      for (int i = maxr, j = minc; j <= maxc && count < maxcount; j++) {
        System.out.println(a[i][j]);
        count++;
      }
      maxr--;

      for (int i = maxr, j = maxc; i >= minr && count < maxcount; i--) {
        System.out.println(a[i][j]);
        count++;
      }
      maxc--;
      for (int i = minr, j = maxc; j >= minc && count < maxcount; j--) {
        System.out.println(a[i][j]);
        count++;
      }
      minr++;
    }
  }
}
