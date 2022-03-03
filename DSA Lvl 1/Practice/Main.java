import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int[][] ans = new int[n][m];
        
        for (int i = 0; i < ans.length; i++) {
          ans[i][m - 1] = arr[i][m - 1];
        }
        GoldMine(arr, ans);
       
       
    }

    static int getMax(int x, int y, int[][] ans) {
      int n = ans.length;
      int m = ans[0].length;
      int a = Integer.MIN_VALUE;
      int b = Integer.MIN_VALUE;
      int c = Integer.MIN_VALUE;

      if (x - 1 >= 0 && x - 1 < n && y + 1 >= 0 && y + 1 < m) {
        a = ans[x - 1][y + 1];
      }

      if (y + 1 >= 0 && y + 1 < m) {
        b = ans[x][y + 1];
      }

      if (x + 1 < ans.length && y + 1 >= 0 && y + 1 < m) {
        c = ans[x + 1][y + 1];
      }

      return Math.max(a,Math.max(b, c));

    }
    
    static void GoldMine(int[][] arr, int[][] ans) {

      for (int i = arr[0].length - 2; i >= 0; i--) {
        for (int j = 0; j < arr.length; j++)
          ans[j][i] = arr[j][i]+getMax(j, i, ans);
      }
      int max=Integer.MIN_VALUE;
      for(int i = 0;i<ans.length;i++)
        max = ans[i][0] > max ? ans[i][0] : max;

        System.out.println(max);
    }
    

}