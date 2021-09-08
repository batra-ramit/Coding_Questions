import java.util.*;

public class P9 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    int nsp1 = 0, nsp2 = n -2;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= nsp1; j++)
        System.out.print("\t");
      System.out.print("*\t");
      for (int j = 1; j <= nsp2; j++)
        System.out.print("\t");
      if (i <= n / 2) {
        nsp1++;
        nsp2 = nsp2 - 2;
      }
      else {
        nsp1--;
        nsp2 = nsp2 + 2;
      }
      if (i != (n / 2 + 1))
        System.out.println("*\t");
      else {
//very imp to ensure nsp2 becomes 1 when middle row to have the bottom triangle of spaces
        nsp2 = 1;
        System.out.println();
      }



    }

  }
}