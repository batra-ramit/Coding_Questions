import java.io.*;
import java.util.*;

public class Main {

  public static class Node {

    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {

    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);

    Stack<Pair> st = new Stack<>();
    st.push(rtp);

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }

  public static int height(Node node) {
    if (node == null) {
      return -1;
    }

    int lh = height(node.left);
    int rh = height(node.right);

    int th = Math.max(lh, rh) + 1;
    return th;
  }

  public static class BST {

    int max;
    int min;
    boolean IsBST;
    int size;
    int MAXS;
    Node MAXN;

    BST(int max, int min, boolean IsBST, int size, int MAXS, Node MAXN) {
      this.max = max;
      this.min = min;
      this.IsBST = IsBST;
      this.size = size;
      this.MAXS = MAXS;
      this.MAXN = MAXN;
    }
  }

  public static BST IsBSTree(Node node) {
    if (node == null) {
      return new BST(Integer.MIN_VALUE, Integer.MAX_VALUE, true, 0, 0, null);
    }

    BST left = IsBSTree(node.left);
    BST right = IsBSTree(node.right);
    boolean ans = true;

    if (
      node.data < left.max ||
      node.data > right.min ||
      left.IsBST == false ||
      right.IsBST == false
    ) ans = false;

    int max = Math.max(left.max, Math.max(node.data, right.max));
    int min = Math.min(right.min, Math.min(node.data, left.min));
    int size = left.size + right.size + 1;

    int maxSize = Math.max(left.MAXS, right.MAXS);
    Node maxNode = left.MAXS > right.MAXS ? left.MAXN : right.MAXN;

    if (ans == true && size > maxSize) {
      maxSize = size;
      maxNode = node;
    }

    BST obj = new BST(max, min, ans, size, maxSize, maxNode);
    return obj;
  }

  public static void isBSTLargest(Node node) {
    BST ans = IsBSTree(node);
    System.out.println(ans.MAXN.data + "@" + ans.MAXS);
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    Node root = construct(arr);
    isBSTLargest(root);
  }
}
