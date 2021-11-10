import java.io.*;
import java.util.*;

public class HighFreqChar {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
Calculate(str);
  }

  public static void Calculate(String Str) {
    StringBuilder sb = new StringBuilder(Str);
    int count[] = new int[26];
    
    for (int i = 0; i < sb.length(); i++) {
      int idx=sb.charAt(i)-'a';
      count[idx]++;
    }
    int max=0;
    for (int j = 1; j < count.length; j++) {
      if (count[j] > max)
        max = j;
    }
    System.out.println((char)(max+'a'));
  }
}
