import java.io.*;
import java.util.*;

public class Recursion_PrintEncodings {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    printEncodings(str, "");
  }

  public static void printEncodings(String str, String asf) {
    if (str.length() == 0) {
      System.out.println(asf);
      return;
    }

    String temp = str.substring(0,1);
    String ros = str.substring(1);
    int n = Integer.parseInt(temp);
    if(n==0)
    return;
    
    char ch = (char)('a' +n -1);
    printEncodings(ros, asf + ch);

    if (str.length() > 1) {
      String temp1 = str.substring(0, 2);
      String ros1 = str.substring(2);
      int n1 = Integer.parseInt(temp1);
      if (n1 <= 26) {
        char ch1 = (char) ('a' +n1-1);
        printEncodings(ros1, asf + ch1);
      }
    }
  }
}