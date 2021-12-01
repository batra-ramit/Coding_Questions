
    import java.io.*;
    import java.util.*;
    import java.lang.*;
    
    public class GetKPC {
    
    
        public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    ArrayList<String> result=getKPC(str);
    
    System.out.println(result);
        }
    static String values[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    
    public static ArrayList<String> getKPC(String str) {
           
    if(str.length()==0){
        ArrayList<String> temp=new ArrayList<>();
        temp.add("");
        return temp;
    }
    char ch=str.charAt(0);
    int pos=Integer.parseInt(str.substring(0,1));
    String previous=str.substring(1);
    
    ArrayList<String> PreRes=getKPC(previous);
    
    ArrayList<String> Result=new ArrayList<>();
    
    // String code=values[ch-48];
    
    String code=values[pos];
    for(int i=0;i<code.length();i++){
    
       char chr=code.charAt(i);
    
       for(String val:PreRes){
           Result.add(chr+val);
       }
    }
    
    
    
    return Result;
    
        }
    
    }