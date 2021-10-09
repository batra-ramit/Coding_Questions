import java.io.*;
import java.util.*;

public class StringComp {

  public static String compression1(String str) {
    String ans = "";
    char c = str.charAt(0);
    ans = ans + c;
    for (int i = 0, j = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch != ans.charAt(j)) {
        ans = ans + ch;
        j++;
      }
    }
    return ans;
  }

  public static String compression2(String str) {
    // write your code here

    String ans="";
    int count=0;
    
    for(int i=0;i<str.length()-1;i++){
        count++;
    if(str.charAt(i)!=str.charAt(i+1))
{
    ans = ans + str.charAt(i);
    if(count>1)
    ans=ans+count;
    count=0;
}
}
ans=ans+str.charAt(str.length()-1);
if(count>1)
ans=ans+count;
return ans;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    System.out.println(compression1(str));
    System.out.println(compression2(str));
  }
}
