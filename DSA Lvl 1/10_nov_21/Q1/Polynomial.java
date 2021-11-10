import java.io.*;
import java.util.*;

public class Polynomial {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
int n=sc.nextInt();
Calculate(x, n);
  }

  public static void Calculate(int x, int n) {
      int sum = 0;
      int mul = 1;
      for (int j = n, i = 1; i<= n; i++, j--) {
          mul = mul * x;
          sum = sum + j * mul;
      }
    System.out.println(sum);
  }
}
