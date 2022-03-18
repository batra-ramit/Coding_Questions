import java.util.*;

public class Main {

    public static int solution(int[] arr) {
        int ans=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int val:arr){
            sum+=(val==0?-1:1);
            if(map.containsKey(sum)){
                int temp=map.get(sum);
                ans=ans+temp;
                map.put(sum,temp+1);
            }
            else
            map.put(sum,1);
        }


        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));
    }

}
