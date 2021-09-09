import java.util.*;

public class P15 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int val = 1;
    int n = scn.nextInt();

    int nsp = n / 2, nst = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= nsp; j++)
        System.out.print("\t");

      if (i <= n / 2 + 1)
        val = i;
      else
        val = n - i + 1;
      for (int j = 1; j <= nst; j++) {

        System.out.print(val + "\t");
        if (j <= nst / 2)
          val++;
        else
          val--;
      }

      System.out.println();
      if (i <= n / 2) {
        nsp--;
        nst += 2;

      } else {

        nsp++;
        nst -= 2;

      }
    }

  }
}