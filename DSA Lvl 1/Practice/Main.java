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

   static class Pair{
       int v;
       int level;

       Pair(int v,int level){
           this.v=v;
           this.level=level;

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
int[] visited=new int[vtces];
Arrays.fill(visited,-1);

      for(int i=0;i<vtces;i++){
         if(visited[i]==-1)
       {boolean boool=IsGraphBipartite(graph,visited,i);
         if(boool==false){
             System.out.println(boool);
             return;
         }
         
         }
         }
   }

   public static boolean IsGraphBipartite(ArrayList<Edge>[] graph,int[] visited,int src){

Queue<Pair> queue=new ArrayDeque<>();

Pair pp=new Pair(src,0);

queue.add(pp);

while(queue.size()>0){

Pair temp=queue.remove();
int nsr=temp.v;
if(visited[nsr]!=-1){
if(temp.level!=visited[nsr])
return false;
   }else{
visited[nsr]=temp.level;
       for(int i=0;i<graph[nsr].size();i++){
           Edge e=graph[nsr].get(i); 
           if(visited[e.nbr]==-1){
              Pair cp = new Pair(e.nbr, temp.level + 1);
               queue.add(cp);
           }
       }
       
       }
   }

   return true;
   }


   
}