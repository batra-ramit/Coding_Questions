
import java.util.*;
  
  public class IsAprime{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       // write ur code here
  int t = scn.nextInt();
  
  for(int i=0;i<t;i++){
      int flag=-1;
      int n=scn.nextInt();
      int d=2,num=n;
      while(d*d<=num){
      if(n%d==0)
      {
          flag=1;
          break;
      }
      d++;
  }
  if(flag==-1)
  System.out.println("prime");
  
  else
  System.out.println("not prime");
   }}
  }