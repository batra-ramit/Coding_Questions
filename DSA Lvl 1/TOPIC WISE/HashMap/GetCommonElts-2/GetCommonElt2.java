import java.io.*;
import java.util.*;

public class GetCommonElt2{

public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<n;i++){
        int temp=sc.nextInt();
if(map.containsKey(temp)==true){
    int a=map.get(temp);
    map.put(temp,++a);
}else{
    map.put(temp,1);
}
    }

int m=sc.nextInt();

for(int j=0;j<m;j++){
    int num=sc.nextInt();
    if(map.containsKey(num)==true){
        System.out.println(num);
        int freq=map.get(num);
        if(freq>1){
            freq--;
            map.put(num,freq);
        }else{
            map.remove(num);
        }
    }
}

 }

}