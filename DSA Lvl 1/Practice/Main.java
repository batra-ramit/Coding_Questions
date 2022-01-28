import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int max=-1;
    int maxSeq=-1;
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<n;i++){
        int a=sc.nextInt();
        if (map.containsKey(a) == false) {
          int b = a--;
            if(map.containsKey(b)==false)
           map.put(a,1);
           else{
               Integer freq=map.get(b);
               map.put(a,++freq);
               if(freq>max)
               {max=freq;
               maxSeq=a;
           }}
        }
    }


    for(int j=maxSeq-max;j<=maxSeq;j++)
    System.out.println(j);
 }

}