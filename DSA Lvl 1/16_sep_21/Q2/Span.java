import java.io.*;
import java.util.*;

public class Span{

public static void main(String[] args) throws Exception {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=s.nextInt();
        
    }
    int max=arr[0],min=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max)
        max=arr[i];
        if(arr[i]<min)
        min=arr[i];
    }
    System.out.println(max-min);
    
 }

}