

import java.io.*;
import java.util.*;

public class FirstIndexArr {

    public static void main(String[] args) throws Exception {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       arr[i]=sc.nextInt();
       int x=sc.nextInt();
       
       System.out.println(firstIndex(arr,n-1,x));
    }

    public static int firstIndex(int[] arr, int idx, int x){
        
        if(idx==-1)
        return -1;
        
        
        int assIndex=firstIndex(arr,idx-1,x);
        
        if(arr[idx]==x && (idx<assIndex || assIndex == -1))
        return idx;
        else
        return assIndex;
        
        
    }

}