import java.io.*;
import java.util.*;

public class Matrix_Pro {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int n1 = s.nextInt();
    int m1 = s.nextInt();
    int[][] a1 = new int[n1][m1];
    for (int i = 0; i < n1; i++) {
      for (int j = 0; j < m1; j++) a1[i][j] = s.nextInt();
    }

    int n2 = s.nextInt();
    int m2 = s.nextInt();
    int[][] a2 = new int[n2][m2];
    for (int i = 0; i < n2; i++) {
      for (int j = 0; j < m2; j++) a2[i][j] = s.nextInt();
    }
    int sum;
    int flag = 0;
    int pro[][] = new int[n1][m2];
    for (int i = 0; i < n1; i++) {
      if (n2 != m1) {
        flag = -1;
        break;
      }
      for (int j = 0; j < m2; j++) {
        sum = 0;
        for (int k = 0; k < n2; k++) sum = sum + a1[i][k] * a2[k][j];

        pro[i][j] = sum;
      }
    }

    if (flag == -1) System.out.println("Invalid input"); else {
      for (int i = 0; i < n1; i++) {
        for (int j = 0; j < m2; j++) System.out.print(pro[i][j] + " ");
        System.out.println();
      }
    }
  }
}
