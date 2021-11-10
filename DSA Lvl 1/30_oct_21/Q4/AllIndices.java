
    import java.io.*;
    import java.util.*;
    
    public class AllIndices {
    
    
        public static void main(String[] args) throws Exception {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int arr[]=new int[n];
           for(int i=0;i<n;i++)
           arr[i]=sc.nextInt();
           int x=sc.nextInt();
           
           if(AllIndex(arr,n-1,x)==-1)
           System.out.println("");
        }
    
        public static int AllIndex(int[] arr, int idx, int x){
            
            if(idx==-1)
            return -1;
            
            
            int assIndex=AllIndex(arr,idx-1,x);
            
            if(arr[idx]==x)
            {System.out.println(idx);
            return -2;}
            else if(assIndex==-2)
            return -2;
            else  
            return -1;
            
            
            
            
            
           
            
            
            
        }
    }
    