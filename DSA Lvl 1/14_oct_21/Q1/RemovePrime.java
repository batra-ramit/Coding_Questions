
    import java.io.*;
    import java.util.*;
    
    public class RemovePrime {
    
    
        public static void solution(ArrayList<Integer> al){
        for(int i=al.size()-1;i>=0;i--){
            int val=al.get(i);
            // System.out.println(val);
           
            if(isprime(val)==true)
            al.remove(i);
        }
            
        }

        public static boolean isprime(int n) {
            boolean b = true;

            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0)
                    b = false;
            }
            return b;
        }
        
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            ArrayList<Integer> al = new ArrayList<>();
            for(int i = 0 ; i < n; i++){
                al.add(scn.nextInt());
            }
            solution(al);
            System.out.println(al);
        }
    
    }
  