import java.util.*;
  
  public class DecToAny{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
      int sum=0,m=1;
      while(n>0){
          int r=n%b;
          sum=sum+r*m;
          m=m*10;
          n=n/b;
      }
      return sum;
   }
  }