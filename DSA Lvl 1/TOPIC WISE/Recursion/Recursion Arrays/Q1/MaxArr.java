package Q1;
import java.io.*;
import java.util.*;

public class MaxArr {

    public static void main(String[] args) throws Exception {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       arr[i]=sc.nextInt();
       
       System.out.println(arr[maxOfArray(arr,n-1)]);
    }

    public static int maxOfArray(int[] arr, int idx){
        if( idx==-1)
        return 0;
        
        int assumptionmaxindex=maxOfArray(arr,idx-1);
        if(arr[idx]>arr[assumptionmaxindex])
        return idx;
        else
        return assumptionmaxindex;
        
    }

}