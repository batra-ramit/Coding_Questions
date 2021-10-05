import java.io.*;
import java.util.*;

public class SaddlePrice {

    public static void main(String[] args) throws Exception {
      
      Scanner scn=new Scanner(System.in);
         int flag=-1;
      int n=scn.nextInt();
      int[][] arr=new int[n][n];
       for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j]=scn.nextInt();
            }
       }
       
       for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
               flag=-1;
               for(int k=0;k<n;k++){
                   if(arr[i][j]<arr[k][j] || arr[i][j]>arr[i][k])
                   flag =1;
               }
               
               if(flag==-1){
                   System.out.println(arr[i][j]);
                   break;
               }
                
            }
            
       }
       if(flag==1)
       System.out.println("Invalid input");
       
       
      
    }

}