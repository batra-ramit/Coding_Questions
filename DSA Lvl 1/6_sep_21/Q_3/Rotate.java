
import java.util.*;

public class Rotate {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int p = sc.nextInt();
    int d = 0, temp = n;
    while (temp > 0) {
      temp = temp / 10;
      d++;
    }




    // very important that you get p to a value between 1 and d to Math.pow

    p = p % d;
    if (p < 0)
      p = d + p;



    int q = n / (int)Math.pow(10, p);
    int r = n % (int)Math.pow(10, p);
    System.out.println(q + r * (int)Math.pow(10, d - p));
  }
}