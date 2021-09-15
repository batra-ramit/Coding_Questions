import java.util.*;
  
  public class AnytoAnyAdd{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
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