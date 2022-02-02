import java.io.*;
import java.lang.*;
import java.util.*;

class KLargestElts {

  public static void main(String[] args) throws IOException {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] num = new int[n];
    for (int i = 0; i < n; i++) {
      num[i] = scn.nextInt();
    }
    int k = scn.nextInt();
    solve(n, num, k);
  }

  // -----------------------------------------------------
  // This is a functional problem. Only this function has to be written.
  // This function takes as input an array,n length of array and k.
  // It should print required output.
  public static void solve(int n, int[] arr, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int i = 0;
    for (int val : arr) {
      if (i < k) {
        pq.add(val);
        i++;
      } else {
        int a = pq.peek();
        if (val > a) {
          pq.remove();
          pq.add(val);
        }
      }
    }

    PriorityQueue<Integer> pqf = new PriorityQueue<>(
      Collections.reverseOrder()
    );
    for (int j = 0; j < k; j++) {
      pqf.add(pq.peek());
      pq.remove();
    }

    for (int j = 0; j < k; j++) {
      System.out.print(pqf.peek() + " ");
      pqf.remove();
    }
  }
}
