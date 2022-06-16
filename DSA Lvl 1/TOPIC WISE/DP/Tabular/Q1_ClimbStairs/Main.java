import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int strg[]=new int[n+1];

        strg[0]=strg[1]=1;

        for(int i=2;i<=n;i++){
        for(int j=1;j<=3;j++){
        if(i-j>=0)
        strg[i]+=strg[i-j];
}
        }

        System.out.println(strg[n]);
    }

}