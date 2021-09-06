
import java.util.*;
  
 public class Pythogorean {
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int tn1=sc.nextInt();
     int tn2=sc.nextInt();
      int tn3=sc.nextInt();
      int n1=0,n2=0,n3=0;
      if(tn1>tn2)
      {
          if(tn1>tn3){
              n1=tn1;
              n2=tn2;
              n3=tn3;
          }
          else{
              n1=tn3;
              n2=tn2;
              n3=tn1;
          }
      }
      else
      {
          if(tn2>tn3){
              n1=tn2;
              n2=tn1;
              n3=tn3;
          }
          else{
              n1=tn3;
              n2=tn2;
              n3=tn1;
          }
      }
      
      
      if(n1*n1==n2*n2+n3*n3)
      System.out.println("true");
      else
      System.out.println("false");
   }
  }