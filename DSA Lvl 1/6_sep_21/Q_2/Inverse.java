
import java.util.*;

public class Inverse {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int temp = n, d = 0;
    while (temp > 0) {
      temp = temp / 10;
      d++;
    }
    int num=0;
    for(int i=1;i<=d;i++){
int q=n/10;
int r=n%10;
n=q;
num=num+(int)Math.pow(10,r-1)*i;



    }
System.out.println(num);
  }
}