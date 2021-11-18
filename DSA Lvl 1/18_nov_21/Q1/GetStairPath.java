import java.io.*;
import java.util.*;

public class GetStairPath {

    public static void main(String[] args) throws Exception {

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

ArrayList<String> Result=getStairPaths(n);
System.out.println(Result);

    }

    public static ArrayList<String> getStairPaths(int n) {
        
if(n<0){
    ArrayList<String> temp=new ArrayList<>();
    return temp;
}
else if(n==0)
{
    ArrayList<String> temp=new ArrayList<>();
    temp.add("");
    return temp;

}

ArrayList<String> previous1=getStairPaths(n-1);
ArrayList<String> previous2=getStairPaths(n-2);
ArrayList<String> previous3=getStairPaths(n-3);


ArrayList<String> Result=new ArrayList<>();

for(String val:previous1){
    Result.add("1"+val);
}
for(String val:previous2){
    Result.add("2"+val);
}
for(String val:previous3){
    Result.add("3"+val);
}

return Result;



    }

}