import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int row=sc.nextInt();
      int col=sc.nextInt();
      int arr[][]=new int[n][n];
      printKnightsTour(arr,row,col,1);  
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        
if(r<0 || c<0 || r>chess.length-1 || c> chess.length-1 || chess[r][c]!=0)
return;

if(upcomingMove==(chess.length-1)*(chess.length-1))
{
    chess[r][c]=upcomingMove;
    displayBoard(chess);
    chess[r][c]=0;
    return;
}


chess[r][c]=upcomingMove;

printKnightsTour(chess,r+2,c-1,upcomingMove+1);
printKnightsTour(chess,r+2,c+1,upcomingMove+1);
printKnightsTour(chess,r-2,c-1,upcomingMove+1);
printKnightsTour(chess,r-2,c+1,upcomingMove+1);
printKnightsTour(chess,r+1,c+2,upcomingMove+1);
printKnightsTour(chess,r+1,c-2,upcomingMove+1);
printKnightsTour(chess,r-1,c-2,upcomingMove+1);
printKnightsTour(chess,r-1,c+2,upcomingMove+1);

chess[r][c]=0;

    }





    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}