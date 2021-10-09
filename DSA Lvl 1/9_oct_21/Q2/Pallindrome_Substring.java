import java.io.*;
import java.util.*;

public class Pallindrome_Substring {

  public static void solution(String str) {
    for (int i = 0; i < str.length(); i++) {
      for (int j = i; j < str.length(); j++) {
        if (ispalindrome(str.substring(i, j + 1)) == true) System.out.println(
          str.substring(i, j + 1)
        );
      }
    }
  }

  public static boolean ispalindrome(String str) {
    boolean bool = true;
    int left = 0;
    int right = str.length() - 1;
    while (left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        bool = false;
        break;
      }
      left++;
      right--;
    }

    return bool;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    solution(str);
  }
}
