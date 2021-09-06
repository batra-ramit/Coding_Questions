
import java.util.*;
    
  public class GcdLcm {
    
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      
      int tn1=n1;
    int tn2=n2;
    while(tn1%tn2!=0){
        int r=tn1%tn2;
        tn1=tn2;
        tn2=r;
    }
      
      System.out.println(tn2);
      System.out.println((n1*n2)/tn2);
      
      
     }
    }
