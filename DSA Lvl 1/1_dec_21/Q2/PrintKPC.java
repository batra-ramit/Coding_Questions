
    import java.io.*;
    import java.util.*;
    import java.lang.*;
    
    public class PrintKPC {
    
    
        public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    printKPC(str,"");
        }
    static String values[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    
        public static void printKPC(String str, String asf) {
            if(str.length()==0){
                System.out.println(asf);
                return;
            }
    
    char ch=str.charAt(0);
    int pos=Integer.parseInt(str.substring(0,1));
    String previos=str.substring(1);
    
    String val=values[pos];
    
    for(int i=0;i<val.length();i++){
        char chr=val.charAt(i);
        printKPC(previos,asf+chr);
    }
    
    
    
        }
    
    }