
    import java.io.*;
    import java.util.*;
    
    public class GetMazePathJump {
    
    
        public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    
    ArrayList<String> ans=new ArrayList<>();
    ans=getMazePaths(1,1,n,m);
    System.out.println(ans);
        }
    
        
        public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
            
    
    if(sc==dc && sr==dr){
        ArrayList<String> temp=new ArrayList<>();
        temp.add("");
        return temp;
    }
    
    
    
    ArrayList<String> Result=new ArrayList<>();
    
    for(int i=1;i<=dc-sc;i++){
        ArrayList<String> hpaths=getMazePaths(sr,sc+i,dr,dc);
        for(String path:hpaths)
        Result.add("h"+i+path);
    }
    for(int i=1;i<=dr-sr;i++){
        ArrayList<String> vpaths=getMazePaths(sr+i,sc,dr,dc);
        for(String path:vpaths)
        Result.add("v"+i+path);
    }
    for(int i=1;i<=dc-sc && i<=dr-sr;i++){
        ArrayList<String> dpaths=getMazePaths(sr+i,sc+i,dr,dc);
        for(String path:dpaths)
        Result.add("d"+i+path);
    }
    
    
    return Result;
    
    
        }
    
    }