import java.io.*;
import java.util.*;

public class Diagnol {

    public static void main(String[] args) throws Exception {
         Scanner scn=new Scanner(System.in);
         
      int n=scn.nextInt();
      int[][] arr=new int[n][n];
       for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j]=scn.nextInt();
            }
       }
        
        
        
        
        
        for(int k=0;k<n;k++){
        for(int i=0,j=0;i< n|| j<n;i++,j++){
            
        if(j+k<n)
        System.out.println(arr[i][j+k]);}
    }}

}