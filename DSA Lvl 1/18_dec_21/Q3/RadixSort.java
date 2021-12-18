
    import java.io.*;
    import java.util.*;
    
    public class RadixSort {
    
    
      public static void radixSort(int[] arr) {
       int max=arr[0];
       for(int i=0;i<arr.length;i++){
           if(arr[i]>max)
    max=arr[i];
       }   
      int place=1;
      while(max/place>0){
          countSort(arr,place);
          place=place*10;
      }
      
      }
    
    public static void countSort(int[] arr, int exp) {
        int farr[]=new int[10];
        int ans[]=new int[arr.length];
    
    for(int i=0;i<arr.length;i++){
    
      int val=arr[i]/exp%10;
      
      farr[val]++;
    }
    
    for(int i=1;i<farr.length;i++){
      farr[i]=farr[i]+farr[i-1];
    }
    
    
    for(int i=arr.length-1;i>=0;i--){
    
    int val=arr[i]/exp%10;
    int pos=farr[val];
    ans[pos-1]=arr[i];
    farr[val]--;
    }
    
    for(int i=0;i<arr.length;i++){
      arr[i]=ans[i];
    }
    
        System.out.print("After sorting on " + exp + " place -> ");
        print(arr);
      }
    
      public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
        }
        System.out.println();
      }
    
      public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
          arr[i] = scn.nextInt();
        }
        radixSort(arr);
        print(arr);
      }
    
    }