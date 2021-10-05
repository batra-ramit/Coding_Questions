import java.io.*;
import java.util.*;

public class RotateBy90 {

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
        
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        
        for(int a=0,b=n-1;a<=b;a++,b--){
            for(int i=0;i<n;i++){
            int temp= arr[i][a];
            arr[i][a]=arr[i][b];
            arr[i][b]=temp;
            }
        }
        
        display(arr);
        
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}