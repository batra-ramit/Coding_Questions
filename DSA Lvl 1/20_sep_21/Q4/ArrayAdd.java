import java.io.*;
import java.util.*;

public class ArrayAdd {

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
    int l = sum.length - 1;
    int carry = 0;
    for (int i = n1, j = n2, k = l; k >= 0 ; i--, j--, k--)
    {


      if (i < 0)
      { sum[k] = ((a2[j] + carry) % 10);
        carry = (a2[j] + carry) / 10;
      }
      else if (j < 0)
      { sum[k] = ((a1[i] + carry) % 10);
        carry = (a1[i] + carry) / 10;
      }
      else {

        int su = (a1[i] + a2[j] + carry) % 10;
        sum[k] = su;
        carry = (a1[i] + a2[j]+carry) / 10;

      }

    }




    for (int i = 0; i < sum.length; i++)
      System.out.println(sum[i]) ;



  }

}