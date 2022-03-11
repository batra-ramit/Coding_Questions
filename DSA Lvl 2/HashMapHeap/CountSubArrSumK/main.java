import java.util.*;

public class Main {

	public static int solution(int[] arr, int target){
		HashMap<Integer,Integer> map=new HashMap<>();
int sum=0;
int ans=0;
map.put(0,1);

for(int val:arr){
sum=sum+val;
if(map.containsKey(sum-target)){
    ans=ans+map.get(sum-target);
}

if(map.containsKey(sum))
map.put(sum,map.get(sum)+1);
else
map.put(sum,1);
        }
		
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        System.out.println(solution(arr,target));
	}

}
