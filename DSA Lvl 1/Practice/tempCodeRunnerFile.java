import java.io.*;
import java.util.*;

public class Main {
   
static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }

   public static ArrayList<Integer> GetConnected(ArrayList<Edge>[] graph,boolean[] visited,int src){


ArrayList<Integer> list=new ArrayList<>();
list.add(src);
visited[src]=true;
   for(Edge e:graph[src]){
      int nsrc=e.nbr;
      if(visited[nsrc]==false)
      {ArrayList<Integer> list1=GetConnected(graph,visited,nsrc);
      for(int val:list1)
      list.add(val);
      }
   }

   
   return list;
}
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(br.readLine());
      int k = Integer.parseInt(br.readLine());
      
      ArrayList<Edge>[] graph = new ArrayList[n];
      for (int i = 0; i < n; i++) {
         graph[i] = new ArrayList<>();
      }
      
      for (int i = 0; i < k; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         
         graph[v1].add(new Edge(v1, v2, 0));
         graph[v2].add(new Edge(v2, v1, 0));
      }

      boolean[] visited=new boolean[n];


      ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
for(int i=0;i<n;i++){
         if(visited[i]==false){
            {ArrayList<Integer> list=GetConnected(graph,visited,i);
            comps.add(list);}
         }
      }
      int sum = 0;
      if (comps.size() != 1) {
         for (int i = 0; i < comps.size(); i++) {
            int a = comps.get(i).size();
            int b;
            if (i + 1 == comps.size())
               b = comps.get(0).size();
            else
               b = comps.get(i + 1).size();

            sum = sum + a * b;
         }
      }
 System.out.println(sum);
   }

}