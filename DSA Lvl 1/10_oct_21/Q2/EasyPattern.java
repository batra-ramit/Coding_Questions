import java.util.Scanner;

public class EasyPattern {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    if (n % 2 == 0) {
      for (int j = 1; j <= n; j = j + 2) {
        int ans = n * (j - 1) + 1;
        for (int i = 1; i <= n; i++) {
          System.out.print((ans++) + " ");
        }
        System.out.println();
      }
      for (int j = n; j >= 1; j = j - 2) {
        int ans = n * (j - 1) + 1;
        for (int i = 1; i <= n; i++) {
          System.out.print((ans++) + " ");
        }
        System.out.println();
      }
    } else {
      for (int j = 1; j <= n; j = j + 2) {
        int ans = n * (j - 1) + 1;
        for (int i = 1; i <= n; i++) {
          System.out.print((ans++) + " ");
        }
        System.out.println();
      }
      for (int j = n - 1; j >= 1; j = j - 2) {
        int ans = n * (j - 1) + 1;
        for (int i = 1; i <= n; i++) {
          System.out.print((ans++) + " ");
        }
        System.out.println();
      }
    }
  }
}
