package Q1;
import java.io.*;
import java.util.*;

public class PrintPermutations {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        printPermutations(str,"");

    }

    public static void printPermutations(String str, String asf) {
        
if(str.length()==0){
    System.out.println(asf);
    return;
}
for(int i=0;i<str.length();i++){
String left=str.substring(0,i);
String right=str.substring(i+1);

printPermutations(left+right,asf+str.charAt(i));}

    }

}