import java.io.*;
import java.util.*;

public class Subset {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++)
      arr[i] = sc.nextInt();

    String str = "";

    for (int i = 0; i < Math.pow(2, n); i++)
    {
      int temp = i;
      for (int j = 0; j < arr.length; j++)
      {
        int rem = temp % 2;
        temp = temp / 2;
        if (rem == 0)
          str = "-\t" + str;
        else
          str = arr[arr.length - 1 - j] + "\t" + str;
      }
      System.out.println(str);
      str = "";
    }
  }

}