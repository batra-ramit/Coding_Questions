import java.io.*;
import java.util.*;

public class Recursion_FloodFill {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int[][] arr = new int[n][m];
    int[][] temp = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = scn.nextInt();
      }
    }

    floodfill(arr, 0, 0, "");
  }

  public static void floodfill(int[][] maze, int sr, int sc, String asf) {
    if (sc == maze[0].length - 1 && sr == maze.length - 1) {
      System.out.println(asf);
      return;
    }

    if (
      sr < 0 ||
      sc < 0 ||
      sr > maze.length - 1 ||
      sc > maze[0].length - 1 ||
      maze[sr][sc] == 1
    ) return;

    maze[sr][sc] = 1;
    floodfill(maze, sr - 1, sc, asf + "t");
    floodfill(maze, sr, sc - 1, asf + "l");
    floodfill(maze, sr + 1, sc, asf + "d");
    floodfill(maze, sr, sc + 1, asf + "r");
    maze[sr][sc] = 0;
  }
}
