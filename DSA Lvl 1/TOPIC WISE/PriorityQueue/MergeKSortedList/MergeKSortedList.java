import java.io.*;
import java.util.*;


public class MergeKSortedList {
public static class Pair implements Comparable<Pair>{
   int data;
   int li;
   int di;
Pair(int data,int li,int di){
this.data=data;
this.li=li;
this.di=di;
}
   public int compareTo(Pair obj){
      return this.data-obj.data;
   }
}
   public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists){
      ArrayList<Integer> rv = new ArrayList<>();
      PriorityQueue<Pair> pq=new PriorityQueue<>();

      for(int li=0;li<lists.size();li++){
         Pair pp=new Pair(lists.get(li).get(0),li,0);
         pq.add(pp);
      }

      while(pq.size()>0){
Pair temp=pq.remove();
rv.add(temp.data);
int d=temp.di+1;
int l=temp.li;
if(d<lists.get(l).size()){
Pair newp=new Pair(lists.get(l).get(d),l,d);
pq.add(newp);}


      }

      return rv;
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int k = Integer.parseInt(br.readLine());
      ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
      for(int i = 0; i < k; i++){
         ArrayList<Integer> list = new ArrayList<>();

         int n = Integer.parseInt(br.readLine());
         String[] elements = br.readLine().split(" ");
         for(int j = 0; j < n; j++){
            list.add(Integer.parseInt(elements[j]));
         }

         lists.add(list);
      }

      ArrayList<Integer> mlist = mergeKSortedLists(lists);
      for(int val: mlist){
         System.out.print(val + " ");
      }
      System.out.println();
   }

}