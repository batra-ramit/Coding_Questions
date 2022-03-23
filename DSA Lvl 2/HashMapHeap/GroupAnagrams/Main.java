import java.util.*;

public class Main {

	public static ArrayList<ArrayList<String>> groupAnagrams(String[] strs) {
	
		HashMap<String,ArrayList<String>> map=new HashMap<>();
		
		for(int i=0;i<strs.length;i++){
		    String str=strs[i];
		    int arr[]=new int[26];
		    for(int j=0;j<str.length();j++){
		        char ch=str.charAt(j);
		        arr[ch-'a']++;
		    }
		    
		    
		    String ans="";
		    for(int j=0;j<arr.length;j++){
		        if(arr[j]!=0){
		            ans=ans+(char)('a'+j)+""+arr[j];
		        }
		    }
		    
		   if(map.containsKey(ans))
		 {
		     ArrayList<String> list=map.get(ans);
		     list.add(str);
		     map.put(ans,list);
		 }
		 else{
		     ArrayList<String> list=new ArrayList<>();
		     list.add(str);
		     map.put(ans,list);
		 }
		    
		}

ArrayList<ArrayList<String>> lists=new ArrayList<>();
for(String strn:map.keySet()){
    lists.add(map.get(strn));
}
return lists;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] arr = new String[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.next();
		}
		ArrayList<ArrayList<String>> anagramsGrouped = groupAnagrams(arr);
		for (ArrayList<String> lst : anagramsGrouped) {
			Collections.sort(lst);
		}
		anagramsGrouped.sort(new ListComparator());
		display(anagramsGrouped);
	}

	// it is used to make the result unique
	static class ListComparator implements Comparator<List<String>> {
		@Override
		public int compare(List<String> l1, List<String> l2) {
			if (l1.size() != l2.size()) {
				return l2.size() - l1.size();
			}

			String l1str = l1.get(0);
			String l2str = l2.get(0);
			return l1str.compareTo(l2str);

		}
	}

	public static void display(ArrayList<ArrayList<String>> list) {
		for (int i = 0; i < list.size(); i++) {
			ArrayList<String> currList = list.get(i);
			for (int j = 0; j < currList.size(); j++) {
				System.out.print(currList.get(j) + " ");
			}
			System.out.println();
		}
	}

}
