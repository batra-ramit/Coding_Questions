import java.io.*;
import java.util.*;

public class WaveDis{

public static void main(String[] args) throws Exception {
    Scanner s=new Scanner(System.in);
    int n1=s.nextInt();
    int m1=s.nextInt();
    int a[][]=new int[n1][m1];
    for(int i=0;i<n1;i++){
        for(int j=0;j<m1;j++)
        a[i][j]=s.nextInt();
    }
 
 for(int j=0;j<m1;j++){
        
            if(j%2==0){
                for(int i=0;i<n1;i++)
                System.out.println(a[i][j]);
            }
            else{
                for(int i=n1-1;i>=0;i--)
                System.out.println(a[i][j]);
            }
            
            
            
            
        
     
 }
    
    
    
    
}

}