import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

Stack<Character> ostack=new Stack<>();
Stack<Integer> vstack=new Stack<>();

for(int i=0;i<exp.length();i++){
    char ch=exp.charAt(i);

    if(ch=='(')
    ostack.push(ch);
    else if(ch>='0' && ch<='9')
    vstack.push(ch-'0');
    else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
        while(ostack.size()>0 && ostack.peek()!='('&& precedence(ostack.peek())>=precedence(ch))
        InfixEval(vstack,ostack);

        ostack.push(ch);
    }
    else if(ch==')'){
        while(ostack.size()>0 && ostack.peek()!='(')
        InfixEval(vstack,ostack);

        ostack.pop();
    }
}

while(ostack.size()>0){
    InfixEval(vstack,ostack);
}
System.out.println(vstack.peek());
    
 }

 static int operation (int v1,int v2,char op){
     if(op=='+')
     return v1+v2;
     else if(op=='/')
     return v1/v2;
     else if(op=='*')
     return v1*v2;
     else
     return v1-v2;
 }

 static int precedence(char op){
     if(op=='*' || op=='/')
     return 2;
     else
     return 1;
 }

 static void InfixEval(Stack<Integer> vstack,Stack<Character> ostack){
     char op=ostack.pop();
     int v2=vstack.pop();
     int v1=vstack.pop();
     int ans=operation(v1,v2,op);
     vstack.push(ans);
 }
}