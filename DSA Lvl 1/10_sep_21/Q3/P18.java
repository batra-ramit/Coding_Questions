import java.util.*;

public class P18 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    int nst = n, nsp = 0;
    for (int i = 1; i <= n; i++ ) {


      for (int j = 1; j <= nsp; j++) {
        System.out.print("\t");
      }
      for (int j = 1; j <= nst; j++) {
        if (i <= n / 2&& i>1) {
          if (j == 1 || j == nst)
            System.out.print("*\t");
          else
            System.out.print("\t");
        } else
          System.out.print("*\t");
      }
      if (i <= n / 2)
      {
        nst -= 2;
        nsp++;
      }
      else {
        nsp--;
        nst += 2;
      }

      System.out.println();


    }

  }
}