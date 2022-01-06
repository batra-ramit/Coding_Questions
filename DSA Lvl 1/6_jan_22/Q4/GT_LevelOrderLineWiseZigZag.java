import java.io.*;
import java.util.*;

public class GT_LevelOrderLineWiseZigZag {

  private static class Node {

    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }

  public static int size(Node node) {
    int s = 0;

    for (Node child : node.children) {
      s += size(child);
    }
    s += 1;

    return s;
  }

  public static int max(Node node) {
    int m = Integer.MIN_VALUE;

    for (Node child : node.children) {
      int cm = max(child);
      m = Math.max(m, cm);
    }
    m = Math.max(m, node.data);

    return m;
  }

  public static int height(Node node) {
    int h = -1;

    for (Node child : node.children) {
      int ch = height(child);
      h = Math.max(h, ch);
    }
    h += 1;

    return h;
  }

  public static void traversals(Node node) {
    System.out.println("Node Pre " + node.data);

    for (Node child : node.children) {
      System.out.println("Edge Pre " + node.data + "--" + child.data);
      traversals(child);
      System.out.println("Edge Post " + node.data + "--" + child.data);
    }

    System.out.println("Node Post " + node.data);
  }

  public static void levelOrderLinewise(Node node) {
    Queue<Node> que = new ArrayDeque<>();
    que.add(node);

    while (que.size() != 0) {
      int currsize = que.size();
      while (currsize > 0) {
        Node rnode = que.remove();
        System.out.print(rnode.data + " ");
        for (Node child : rnode.children) {
          que.add(child);
        }
        currsize--;
      }
      System.out.println();
    }
  }

  public static void LevelOrderZigZag(Node root) {
    Queue<Node> queue = new ArrayDeque<>();
    Stack<Node> stack = new Stack<>();
    int n = 0;
    queue.add(root);
    stack.push(root);
    while (queue.size() != 0) {
      int currsize = queue.size();

      while (currsize > 0) {
        if (n % 2 != 0) {
          Node temp = queue.remove();
          Node val = stack.pop();
          System.out.print(val.data + " ");
          for (Node child : temp.children) {
            queue.add(child);
          }
        } else {
          Node temp = queue.remove();
          System.out.print(temp.data + " ");
          for (Node child : temp.children) {
            queue.add(child);
            stack.push(child);
          }
        }

        currsize--;
      }
      System.out.println(n);
      n++;
    }
  }
// Repeated same question here for practice as SUMEET SIR SAYS REPETION IS THE ONLY WAY
  public static void ZZ(Node node) {
    Queue<Node> queue = new ArrayDeque<>();
    Stack<Node> stack = new Stack<>();

    queue.add(node);
    stack.add(node);
    int n = 0;
    while (queue.size() != 0) {
      int currsize = queue.size();
      while (currsize > 0) {
        if (n % 2 == 0) {
          Node temp = queue.remove();
          System.out.print(temp.data + " ");
          for (Node child : temp.children) {
            queue.add(child);
            stack.push(child);
          }
      } else {
          Node temp = queue.remove();
          Node val = stack.pop();
          System.out.print(val.data + " ");
          for (Node child : temp.children) {
            queue.add(child);
          }
        }

        currsize--;
      }
    }
    System.err.println();
    n++;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);
    LevelOrderZigZag(root);
  }
}
