import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int strg[]=new int[n+1];
   int ans=fib(strg,n);

   System.out.println(strg[n]);
 }

 public static int fib (int[] strg,int n) {
     if(n==0 || n==1)
     return n;
     else if(strg[n]>0)
     return strg[n];
     else if (n<0)
     return 0;
    

     int a=fib(strg,n-1)+fib(strg,n-2);
     strg[n]=a;
     return a;
 }

}