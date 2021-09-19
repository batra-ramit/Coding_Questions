import java.io.*;
import java.util.*;

public class FindElt{

public static void main(String[] args) throws Exception {
   Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   int[] arr=new int[n];
   for(int i=0;i<n;i++)
   arr[i]=s.nextInt();
   int f=-1;
    int d=s.nextInt();
    for(int j=0;j<n;j++){
        if(arr[j]==d)
        f=j;
    }
    
    System.out.println(f);
}

}