

import java.util.*;

public class PrintPrimesTillN  {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int low = sc.nextInt();
    int high = sc.nextInt();
    for (int i = low; i <= high; i++) {
      int num = i;
      int d = 2;
      int flag=-1;
      while (d * d <= i)
      {
          if(num%d==0){
              flag=1;
          }
          d++;
      }

if(flag==-1)
System.out.println(i);


    }
  }
}
