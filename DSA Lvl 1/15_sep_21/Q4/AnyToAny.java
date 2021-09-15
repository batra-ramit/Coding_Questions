import java.util.*;
  
  public class AnytoAny{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     
     
     int num=AnytoAny(n,sourceBase,destBase);
     System.out.println(num);
   }   
   static int AnytoAny(int n,int b1,int b2){
       int s1=0,m1=1,s2=0,m2=1;
       
       
       while(n>0){
           int r=n%10;
           s1=s1+r*m1;
           m1=m1*b1;
           n=n/10;
       }
       
       while(s1>0){
           int r=s1%b2;
           s2=s2+r*m2;
           m2=m2*10;
           s1=s1/b2;
       }
       return s2;
       
   }
   
   
   
  }