import java.io.*;
import java.util.*;

public class SubArr {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int n1 = s.nextInt();
    int a1[] = new int[n1];
    for (int i = 0; i < a1.length; i++)
      a1[i] = s.nextInt();


    int n2 = s.nextInt();
    int a2[] = new int[n2];

    for (int i = 0; i < a2.length; i++)
      a2[i] = s.nextInt();

    int sum[] = new int[n1 > n2 ? n1 : n2];

    n1--;
    n2--;
    int n3 = sum.length - 1;
    int b = 0;
    for (int i = n1, j = n2, k = n3; k >= 0; i--, j--, k--) {

      if (i < 0) {
        sum[k] = a2[j] - b;
        b=0;
      }
      else if (j < 0) {
        sum[k] = a1[i] - b;
        b=0;
      }
      else {
        if (a2[j] < a1[i]+b)
        { a2[j] = a2[j] + 10;
          sum[k] = a2[j] - a1[i] - b;

          b = 1;
        }
        else {
          sum[k] = a2[j] - a1[i] - b;
          b = 0;
        }

      }
    }
    for (int j = 0; j < sum.length; j++) {
      if (sum[j] != 0)
      { int pos = j;
                  for (int i = pos; i < sum.length; i++)
                    System.out.println(sum[i]);
        break;
      }
    }

  }

}