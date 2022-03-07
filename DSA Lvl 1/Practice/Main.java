import java.io.*;
import java.util.*;

public class Main {
  public static int calPoints(String[] ops) {
    Stack<Integer> st=new Stack<>();
    for (int i = 0; i < ops.length; i++) {
      
     
      String str = ops[i];
      char ch = str.charAt(0);
      
      if(ch=='C'){
      st.pop(); 
      }else if(ch=='D'){
        int val=st.peek();
        st.push(2 * val);
      }else if(ch=='+'){
        int a=st.pop();
        int b=st.peek();
        int c = a + b;
        st.push(a);
        st.push(c);
      }  else {
        int num=Integer.parseInt(str);
        st.push(num);
      }
     
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    int result = calPoints(read.readLine().split(" "));
    System.out.println(result);

  }
}
