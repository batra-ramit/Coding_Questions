package Q1;
import java.io.*;
import java.util.*;

public class CountSort {

  public static void countSort(int[] arr, int min, int max) {
   
   int farr[]=new int[max-min+1];

   for(int i=0;i<arr.length;i++){
       int val=arr[i]-min;
       farr[val]++;
   }
   for(int i=1;i<farr.length;i++)
   farr[i]=farr[i-1]+farr[i];
   
   int ans[]=new int[arr.length];

   for(int i=arr.length-1;i>=0;i--){
       int pos=arr[i]-min;
       int res=farr[pos]-1;
       farr[pos]--;
       ans[res]=arr[i];
       
   }
   print(ans);
   
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    
  }

}