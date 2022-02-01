import java.io.*;
import java.util.*;

public class Main {

  public static class PriorityQueue {

    ArrayList<Integer> data;

    public PriorityQueue() {
      data = new ArrayList<>();
    }

    public void add(int val) {
      data.add(val);

      int i = data.size() - 1;

      while (i >= 0) {
        int parentindex = i / 2;
        int parent = data.get(parentindex);
        int child = data.get(i);
        if (child < parent) {
          data.set(parentindex, child);
          data.set(i, parent);
        } else {
          break;
        }
        i = parentindex;
      }
    }

    public int remove() {
      if (data.size() == 0) {
        System.out.println("Underflow");
        return -1;
      }

      int size = data.size() - 1;
      int value = data.get(size);
      int temp = data.get(0);

      data.set(0, value);
      data.set(size, temp);

      data.remove(size);
      int i = 0;
      while (i < data.size()) {
        int min = i;

        int li = i * 2 + 1;
        int ri = i * 2 + 2;

        if (li < data.size() && data.get(li) < data.get(min)) min = li;
        if (ri < data.size() && data.get(ri) < data.get(min)) min = ri;

        if (min != i) {
          int parent = data.get(i);
          int child = data.get(min);
          data.set(i, child);
          data.set(min, parent);
          i = min;
        } else {
          break;
        }
      }

      return temp;
    }

    public int peek() {
      if (data.size() == 0) {
        System.out.println("Underflow");
        return -1;
      }
      return data.get(0);
    }

    public int size() {
      return data.size();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PriorityQueue qu = new PriorityQueue();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}
