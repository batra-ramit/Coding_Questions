import java.util.*;
  
  public class AnyToDec{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      int sum=0,m=1;
      while(n>0){
          int r=n%10;
          sum=sum+m*r;
          m=m*b;
          n=n/10;
      }
      return sum;
   }
  }