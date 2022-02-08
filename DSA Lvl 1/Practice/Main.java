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

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      boolean[] visited=new boolean[vtces];

      for(int i=0;i<graph.length;i++){
         if(visited[i]==false){
            boolean bool=IsCyclic(graph,visited,i);
            if(bool==true)
            {
               System.out.println(true);
               break;
            }
         }

      }
      System.out.println(false);
   }
   public static boolean IsCyclic(ArrayList<Edge>[] graph,boolean[] visited,int src){
Queue<Integer> queue=new ArrayDeque<>();
queue.add(src);

while(queue.size()>0){
    int vert=queue.remove();
    if(visited[vert]==true)
return true;
else{
   for(int i=0;i<graph[vert].size();i++){
      Edge edge=graph[vert].get(i);
      if(visited[edge.nbr]==false){
         queue.add(edge.nbr);
      }
      else{
         return true;
      }
   }

}
}
return false;
   }
}