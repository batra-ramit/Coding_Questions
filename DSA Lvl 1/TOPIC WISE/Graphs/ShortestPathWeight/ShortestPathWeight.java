import java.io.*;
import java.util.*;

public class ShortestPathWeight {

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

  static class Pair implements Comparable<Pair> {

    int vertex;
    String path;
    int weight;

    Pair(int vertex, String path, int weight) {
      this.vertex = vertex;
      this.path = path;
      this.weight = weight;
    }

    public int compareTo(Pair other) {
      return this.weight - other.weight;
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

    int src = Integer.parseInt(br.readLine());

    PriorityQueue<Pair> pq = new PriorityQueue<>();

    Pair pp = new Pair(src, src + "", 0);
    pq.add(pp);
    boolean visited[] = new boolean[vtces];
    while (pq.size() > 0) {
      Pair temp = pq.remove();

      if (visited[temp.vertex] == false) {
        visited[temp.vertex] = true;
        System.out.println(
          temp.vertex + " via " + temp.path + " @ " + temp.weight
        );
        for (int i = 0; i < graph[temp.vertex].size(); i++) {
          Edge edge = graph[temp.vertex].get(i);
          int next = edge.nbr;
          if (visited[next] == false) {
            Pair cp = new Pair(
              next,
              temp.path + next + "",
              temp.weight + edge.wt
            );
            pq.add(cp);
          }
        }
      }
    }
  }
}
