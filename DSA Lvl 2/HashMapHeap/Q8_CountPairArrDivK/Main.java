// { Driver Code Starts
    import java.util.*;
    import java.io.*;
    import java.lang.*;
    
    class Main
    {
        public static void main (String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
            while(t-->0){
                
                int n = Integer.parseInt(br.readLine().trim());
                String inputLine[] = br.readLine().trim().split(" ");
                int arr[] = new int[n];
                for(int i=0; i<n; i++){
                    arr[i] = Integer.parseInt(inputLine[i]);
                }
                
                int k = Integer.parseInt(br.readLine().trim());
                
                Solution ob= new Solution();
                System.out.println(ob.countKdivPairs(arr, n, k));
            }
        }
    }// } Driver Code Ends
    
    
    //User function Template for Java
    
    class Solution
    {
        public static int countKdivPairs(int arr[], int n, int k)
        {
           int ans=0;
           HashMap<Integer,Integer> map=new HashMap<>();
           
           for(int i=0;i<arr.length;i++){
               int rem=arr[i]%k;
               
               if(rem<0)
               rem+=k;
               
               if(map.containsKey(rem))
                   map.put(rem,map.get(rem)+1);
               else
                   map.put(rem,1);
           }
       
           for(int i=1;i<=k/2;i++)
           {
               if(map.containsKey(i) && map.containsKey(k-i))
               ans+=map.get(i)*map.get(k-i);
           }
           
           if(map.containsKey(0))
           ans+=map.get(0)*(map.get(0)-1)/2;
           
           if(k%2==0 && map.containsKey(k/2))
           ans+=(map.get(k/2)*(map.get(k/2)-1)/2) - map.get(k/2)*map.get(k/2);;
           
           return ans;
        }
    }