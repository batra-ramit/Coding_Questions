import java.io.*;
import java.util.*;

public class  Subsequencs_ArrList_Recursion{

    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    ArrayList<String> result=new ArrayList<String>();
    result=gss(str);
    System.out.println(result);
    }

    public static ArrayList<String> gss(String str) {
       
       if(str.length()==0)
       {
           ArrayList<String> res=new ArrayList<String>();
           res.add("");
           return res;
       }
       int l=str.length();
       char ch=str.charAt(0);
       
                  ArrayList<String> temp=new ArrayList<String>();
                  temp=gss(str.substring(1));
       ArrayList<String> fin =new ArrayList<String>();
       for(int i=0;i<temp.size();i++){
           
           fin.add(temp.get(i));
          
       }
       
       for(int i=0;i<temp.size();i++){
           
         
           fin.add(ch+temp.get(i));
       }
       
       return fin;
       }

}