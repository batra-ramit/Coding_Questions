import java.io.*;
import java.util.*;

public class Main {

  public static class Node {

    int data;
    Node left;
    Node right;

    
  }

  public static class Pair {

    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(int[] arr, int l, int r) {
    if(l>r)
      return null;

    int mid = (l + r) / 2;
    Node node = new Node();
    node.data = arr[mid];
    node.left = construct(arr, l, mid - 1);
    node.right = construct(arr, mid + 1, r);
    
    return node;
   
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
   
    int[]farr={12,25,37,50,62,75,87};
    Node root = construct(farr,0,farr.length-1);
    display(root);
  }
}
