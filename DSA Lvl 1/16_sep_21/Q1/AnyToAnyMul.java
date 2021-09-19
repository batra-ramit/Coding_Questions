
 

import java.util.*;

public class AnyToAnyMul {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
  }

  public static int getProduct(int b, int n1, int n2) {
    int mul = 1, ans = 0;
    while (n2 > 0) {

      int r1 = n2 % 10;
      ans = sum(ans,b,mul*Pro(n1,r1,b));
      n2 = n2 / 10;
      mul = mul * 10;

    }
    return ans;

  }

  static int Pro(int n1, int num, int b) {
      int c=0;
    int carry = 0, sum = 0, mul = 1;
    while (n1 > 0 || carry>0) {

      int r = n1 % 10;
      int a = r * num + carry;

      carry = a / b;
      int temp = a % b;
      sum = sum + mul * temp;
      mul = mul * 10;
      n1=n1/10;

    }return sum;
  }
  
  public static int sum(int n1, int b, int n2){
       int carry=0,mul=1,sum=0;
       while(n1>0 || n2> 0 || carry>0){
           int r1=n1%10;
           int r2=n2%10;
           int temp=(r1+r2+carry)%b;
           carry=(r1+r2+carry)/b;
           sum=sum+temp*mul;
           mul=mul*10;
           n1=n1/10;
           n2=n2/10;
           
           
       }
       return sum;
   }

}