import java.util.*;

public class Main {

	public static int solution(int[] arr) {
		int k=0;
		int ans=0;
int sum=0;
HashMap<Integer,Integer> map=new HashMap<>();
map.put(sum,1);
for(int val:arr){
sum+=val;

if(map.containsKey(sum))
{
ans+=map.get(sum);
map.put(sum,map.get(sum)+1);
}else
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
