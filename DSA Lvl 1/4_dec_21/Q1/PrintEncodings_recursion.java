package Q1;
import java.io.*;
import java.util.*;

public class PrintEncodings_recursion {

    public static void main(String[] args) throws Exception {
     Scanner sc=new Scanner(System.in);  
     String Str=sc.next();  
     printEncodings(Str,"");
    }

    public static void printEncodings(String str,String asf) {
        
if(str.length()==0){
    System.out.println(asf);
}else if(str.length()==1){
    String ch0=str.substring(0,1);
    String previous=str.substring(1);

    int code=Integer.parseInt(ch0);
    if(code==0)
    return;
    char ch=(char)('a'+code-1);
    printEncodings(previous,asf+ch);
}else{
     String ch0=str.substring(0,1);
    String previous=str.substring(1);

    int code=Integer.parseInt(ch0);
    if(code==0)
    return;
    char ch=(char)('a'+code-1);
    printEncodings(previous,asf+ch);

    String ch2=str.substring(0,2);
    String previous1=str.substring(2);

    int code1=Integer.parseInt(ch2);
    if(code1<=26){
    char ch1=(char)('a'+code1-1);
    printEncodings(previous1,asf+ch1);}
}
        




    }

}