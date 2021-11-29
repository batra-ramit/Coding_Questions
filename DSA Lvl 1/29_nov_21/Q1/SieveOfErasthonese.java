import java.util.Scanner;

public class SieveOfErasthonese {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n++;
        boolean arr[] = new boolean[n];
        for (int i = 2; i < n; i++) {
            arr[i] = true;
        }

        for (int i = 2,j=i*i; i *i < n; i++) {
            
            if (arr[j] == true) {
                for(int k=j;k<n;k=k+i)
                    arr[k] = false;
            }
        }

for(int i=2;i<n;i++)
{
    if(arr[i]==true)
    System.out.println(i);
}
    }
}
