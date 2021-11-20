import java.io.*;
import java.util.*;

public class GetMazePath {

    public static void main(String[] args) throws Exception {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
ArrayList<String> ans=getMazePaths(1,1,n,m);
System.out.println(ans);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
          ArrayList<String> temp=new ArrayList<>();
          temp.add("");
          return temp;  
        }
        else if(sr>dr || sc>dc){
            ArrayList<String> temp=new ArrayList<>();
          
          return temp;
        }


ArrayList<String> rightmoves=getMazePaths(sr,sc+1,dr,dc);
ArrayList<String> downmoves=getMazePaths(sr+1,sc,dr,dc);


ArrayList<String> ans=new ArrayList<>();
for(String val:rightmoves){
ans.add("h"+val);
    }
    for(String val:downmoves){
ans.add("v"+val);
    }
return ans;
}
}