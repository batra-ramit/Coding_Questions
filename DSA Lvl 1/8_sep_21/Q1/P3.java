import java.util.*;

public class P3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

       int n=scn.nextInt();
       int nst=1,nsp=n-1;
       for(int i=1;i<=n;i++){
    
           for(int j=1;j<=nsp;j++)
           System.out.print("\t");
           
            for(int j=1;j<=nst;j++)
           System.out.print("*\t");
           
           
           System.out.println();
           nsp--;
           nst++;
       }

    }
}