import java.io.*;
import java.util.*;

public class SpreadOfInfection {

  static class Edge {

    int src;
    int nbr;

    Edge(int src, int nbr) {
      this.src = src;
      this.nbr = nbr;
    }
  }

  public static class Pair {

    int vertex;
    int time;

    Pair(int vertex, int time) {
      this.vertex = vertex;
      this.time = time;
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
      graph[v1].add(new Edge(v1, v2));
      graph[v2].add(new Edge(v2, v1));
    }

    int src = Integer.parseInt(br.readLine());
    int t = Integer.parseInt(br.readLine());
    int count = 0;
    boolean visited[] = new boolean[vtces];

    Queue<Pair> queue = new ArrayDeque<>();
    Pair pp = new Pair(src, 1);
    queue.add(pp);

    while (queue.size() > 0) {
      Pair temp = queue.remove();

      int vrt = temp.vertex;
      int time = temp.time;
      if (time > t) break;
      if (visited[vrt] == false) {
        visited[vrt] = true;

        count++;
        for (int i = 0; i < graph[vrt].size(); i++) {
          Edge ed = graph[vrt].get(i);
          if (visited[ed.nbr] == false) {
            Pair cp = new Pair(ed.nbr, time + 1);
            queue.add(cp);
          }
        }
      }
    }

    System.out.println(count);
  }
}
class SpreadOfInfection {
    
}
