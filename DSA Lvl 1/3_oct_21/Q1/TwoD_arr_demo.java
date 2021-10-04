
import java.util.*;
import java.io.*;

public class TwoD_arr_demo{

public static void main(String[] args) throws Exception {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int m=s.nextInt();
    int arr[][]=new int[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr[i][j]=s.nextInt();
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(arr[i][j]+" ");
        }System.out.println();
    }
    
 }

}