import java.util.*;

public class AnytoAnySub {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getDifference(b, n1, n2);
    System.out.println(d);
  }

  public static int getDifference(int b, int n1, int n2) {
    int diff = 0, mul = 1, borrow = 0;
    while (n2 > 0 ) {
      int r1 = n1 % 10, r2 = n2 % 10;
      r1 = r1 + borrow;

      if (r1 > r2)
      { borrow = 1;

        r2 = r2 + b;
      }
      else
        borrow = 0;

      int temp = r2 - r1;
      diff = diff + mul * temp;

      mul = mul * 10;
      n1 = n1 / 10;
      n2 = n2 / 10;
    }
    return diff;
  }

}