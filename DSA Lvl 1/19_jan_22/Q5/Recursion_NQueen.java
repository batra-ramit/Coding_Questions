
    import java.io.*;
    import java.util.*;
    
    public class Recursion_NQueen {
    
    
      public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        int[][] chess = new int[n][n];
    
    
        
        printNQueens(chess, "", 0);
      }
    
      public static void displayBoard(int[][] chess) {
        for (int i = 0; i < chess.length; i++) {
          for (int j = 0; j < chess[0].length; j++) {
            System.out.print(chess[i][j] + " ");
          }
          System.out.println();
        }
    
        System.out.println();
      }
    
    
      public static boolean IsSafe(int[][] chess, int r, int c) {
    
          for(int i=r-1,j=c;i>=0;i--)
          {
              if(chess[i][j]>0)
              return false;
          }
        for(int i=r-1,j=c-1;i>=0 && j>=0;i--,j--)
          {
              if(chess[i][j]>0)
              return false;
          }
          for(int i=r-1,j=c+1;i>=0 && j<chess.length;i--,j++)
          {
              if(chess[i][j]>0)
              return false;
          }
          
       return true; 
      }
    
    
    
    
      public static void printNQueens(int[][] chess, String qsf, int row) {
        if (row == chess.length) {
          System.out.println(qsf + ".");
          return;
        }
    
        for (int i = 0; i < chess.length; i++) {
          if (IsSafe(chess, row, i) == true) {
            
            chess[row][i] = 1;
            printNQueens(chess, qsf + row + "-" + i + ", ", row + 1);
            chess[row][i] = 0;
          }
        }
        return;
      }
    }
    