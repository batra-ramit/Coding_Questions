package Q1;
import java.io.*;
import java.util.*;

public class GT_IterativePrePost {
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
  public static class pair{
      Node node;
      int state;   
  

  pair(Node node,int state){
      this.node=node;
      this.state=state;
  }}

  public static void IterativePreandPostOrder(Node node) {
    Stack<pair> st=new Stack<>();
    pair pp=new pair(node,-1);
    st.push(pp);
String preorder="";
String postorder="";
    while(st.size()>0){
        pair top=st.peek();

        if(top.state==-1){
preorder=preorder+top.node.data+" ";
top.state++;
        }else if(top.state==top.node.children.size()){
postorder=postorder+top.node.data+" ";
st.pop();
        }else{
pair cp=new pair(top.node.children.get(top.state),-1);
st.push(cp);
top.state++;
        }
    }
System.out.println(preorder);
  System.out.println(postorder);
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
    IterativePreandPostOrder(root);
  }

}