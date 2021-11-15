import java.util.Arrays;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner6;

public class TargetSumTriplet {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int target = sc.nextInt();
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    Arrays.sort(arr);

    for (int i = 0; i < arr.length; i++) {
      int newTarget = target - arr[i];

      int l = i + 1, r = arr.length - 1;
      while (l < r) {
        if (arr[l] + arr[r] < newTarget) {
          l++;
        } else if (arr[l] + arr[r] > newTarget) {
          r--;
        } else {
          System.out.println(arr[i] + " " + arr[l] + " " + arr[r]);
          l++;
          r--;
        }
      }
    }
  }
}
