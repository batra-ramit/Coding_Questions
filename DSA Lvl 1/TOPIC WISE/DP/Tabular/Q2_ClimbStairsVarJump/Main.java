import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int strg[]=new int[n+1];
        strg[n]=1;

        for(int i=n-1;i>=0;i--){
            for(int j=1;j<=arr[i];j++){
                if(i+j<=n)
                strg[i]+=strg[i+j];
            }
        }

        System.out.println(strg[0]);
    }

}