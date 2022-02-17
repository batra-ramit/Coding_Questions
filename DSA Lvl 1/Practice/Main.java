import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[][] arr = new int[n][n];

    for (int j = 0; j < n; j++) {
      String line = br.readLine();
      for (int k = 0; k < n; k++) {
        arr[j][k] = line.charAt(k) - '0';
      }
    }

    findCelebrity(arr);
  }

  public static void findCelebrity(int[][] arr) {
    Stack<Integer> st = new Stack<>();

    for (int i = 0; i < arr.length; i++) st.push(i);

    while (st.size() > 1) {
      int v1 = st.pop();
      int v2 = st.pop();

      if (arr[v1][v2] == 0) st.push(v1);

      if (arr[v2][v1] == 0) st.push(v2);
    }
    boolean b = true;
    int res = st.peek();
    for (int i = 0; i < arr.length; i++) {
      if (arr[res][i] == 1) b = false;
      if (arr[i][res] == 0 && i != res) b = false;
    }
    if (b == true) System.out.println(st.peek()); else System.out.println(
      "none"
    );
  }
}
