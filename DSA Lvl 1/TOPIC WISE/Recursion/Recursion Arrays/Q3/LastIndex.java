
    

    import java.io.*;
    import java.util.*;
    
    public class LastIndex {
  
    
        public static void main(String[] args) throws Exception {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int arr[]=new int[n];
           for(int i=0;i<n;i++)
           arr[i]=sc.nextInt();
           int x=sc.nextInt();
           
           System.out.println(LastIndex(arr,n-1,x));
        }
    
        public static int LastIndex(int[] arr, int idx, int x){
            
            if(idx==-1)
            return -1;
            
            
            int assIndex=firstIndex(arr,idx-1,x);
            // System.out.println(assIndex);
            if(arr[idx]==x && (idx>assIndex))
            return idx;
            else
            return assIndex;
            
            
        }
    
    }