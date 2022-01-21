import java.io.*;
	import java.util.*;

	public class PrintMazePath {

	    public static void main(String[] args) throws Exception {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();

printMazePaths(1,1,n,m,"");
	    }

	   
	    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
	        

if(sc==dc && sr==dr){
    System.out.println(psf);
    return;
}else if(sr>dr || sc>dc){
    return;
}

            printMazePaths(sr,sc+1,dr,dc,psf+"h");
            printMazePaths(sr+1,sc,dr,dc,psf+"v");
	    }

	}