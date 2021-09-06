import java.util.*;
    
    public class CountDigits{
    
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int temp=n;
      long d=1;
      while(temp>0){
      temp=temp/10;
      d=d*10;
    //   System.out.println(d);
      }
      d=d/10;
    //   System.out.println(d);
      while(d>0){
          int q=n/(int)d;
          int r=n%(int)d;
          n=r;
          System.out.println(q);
          d=d/10;
          
      }
      
      
     }
    }