import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        int [][]temp=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        floodfill(arr,temp, 0, 0,"");
    }
    
   
    public static void floodfill(int[][] maze,int[][] temp, int sr, int sc, String asf) {
    
    if(maze[sr][sc]==1 || temp[sr][sc]==1 || sr>maze.length-1 || sc>maze[0].length-1 || sr<0 || sc<0)
    return;

    if(sc==maze[0].length-1 && sr==maze.length-1)
    {System.out.println(asf);
    return;}

temp[sr][sc]=1;
floodfill(maze,temp,sr+1,sc,asf+"d");
floodfill(maze,temp,sr-1,sc,asf+"t");
floodfill(maze,temp,sr,sc+1,asf+"r");
floodfill(maze,temp,sr,sc-1,asf+"l");
temp[sr][sc]=0;
    }
}
