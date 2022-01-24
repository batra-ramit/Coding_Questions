
    import java.io.*;
    import java.util.*;
    
    public class GT_Diameter {
    
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
    static int diameter=-1;
    
    
    public static int Diam(Node node){
    
    int h=-1;
    
    int mh1=-1;
    int mh2=-1;
    
    for(Node child:node.children){
    
      int temp=Diam(child);
    
      if(temp>mh1)
      mh1=temp;
      else if(temp>mh2 && temp<=mh1)
      mh2=temp;
    
      h=Math.max(temp,h);
    
    }
    
    if(diameter<mh1+mh2+2)
    diameter=mh1+mh2+2;
    
    
    return h+1;
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
        int a=Diam(root);
        System.out.println(diameter);
      }
    
    }
