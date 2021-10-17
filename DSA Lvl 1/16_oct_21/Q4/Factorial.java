

  
    import java.io.*;
    import java.util.*;
    
    public class Factorial {
    
    
        public static void main(String[] args) throws Exception {
           Scanner scn=new Scanner(System.in);
           int n=scn.nextInt();
           System.out.println(factorial(n));
        }
    
        public static int factorial(int n){
            //  IF TEST CASE IS 0 THEN OUTPUT WILL BE 1
            if(n==0)
            return 1;
            return n*factorial(n-1);
        
        }
    
    }
