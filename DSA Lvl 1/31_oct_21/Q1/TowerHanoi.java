
    import java.io.*;
    import java.util.*;
    
    public class TowerHanoi {
    
    
        public static void main(String[] args) throws Exception {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int id1=sc.nextInt();
           int id2=sc.nextInt();
           int id3=sc.nextInt();
           
           toh(n,id1,id2,id3);
        }
    
        public static void toh(int n, int t1, int t2, int t3){
            
            if(n==0)
            return;
            
            toh(n-1,t1,t3,t2);
            System.out.println(n+"["+t1+" -> "+t2+"]");
            toh(n-1,t3,t2,t1);
            
        }
    
    }