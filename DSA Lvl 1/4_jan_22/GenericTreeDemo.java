import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;
import javax.lang.model.util.ElementScanner6;

public class GenericTreeDemo {

  public static class Node {

    int data;
    ArrayList<Node> children = new ArrayList<>();

    Node(int data) {
      this.data = data;
    }
  }

  public static void LevelOrder(Node root) {
    Queue<Node> queue = new ArrayDeque<>();
    queue.add(root);

    while (queue.size() > 0) {
      Node temp = queue.remove();
      System.out.print(temp.data + "  ");
      for (Node val : temp.children) {
        queue.add(val);
      }
    }
    System.out.println(".");
  }

  public static void LevelOrderLineWise(Node node) {
    Queue<Node> que = new ArrayDeque<>();
    que.add(node);

    while (que.size() != 0) {
      int currsize = que.size();
      while (currsize > 0) {
        Node temp = que.remove();
        System.out.print(temp.data + " ");
        for (Node child : temp.children) {
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

  public static Node construct(int arr[]) {
    int i = 0;
    Stack<Node> stack = new Stack<>();
    while (i < arr.length - 1) {
      if (arr[i] != -1) {
        Node temp = new Node(arr[i]);
        stack.push(temp);
      } else {
        Node child = stack.pop();
        Node parent = stack.peek();
        parent.children.add(child);
      }
      i++;
    }

    return stack.peek();
  }

  public static void Syrialize(Node Root, ArrayList<Integer> list) {
    list.add(Root.data);

    for (Node temp : Root.children) {
      Syrialize(temp, list);
    }
    list.add(-1);
  }

  public static void removeLeaves(Node node) {
    for (Node child : node.children) {
      if (child.children.isEmpty() == true) {
        int i = node.children.indexOf(child);
        node.children.remove(i);
    }
    }
    for (Node child : node.children) 
    removeLeaves(child);
  }


  public static void linearize(Node node){
    if(node.children.size()==0)
      return;
  
  
        Node child = node.children.get(0);
        
        for (int i = 1; i < node.children.size(); i++) {
          Node temp = node.children.get(i);
          child.children.add(temp);
          node.children.remove(i);
          i--;
        }
      
        linearize(child);
      }
  public static void main(String[] args) {
    int[] arr = {
      10,
      20,
      50,
      -1,
      60,
      -1,
      -1,
      30,
      70,
      -1,
      80,
      110,
      -1,
      120,
      -1,
      -1,
      90,
      -1,
      -1,
      40,
      100,
      -1,
      -1,
      -1,
    };

    Node root = construct(arr);
    LevelOrderLineWise(root);
    System.out.println();
   linearize(root);
   System.out.println();
   LevelOrderLineWise(root);
    ArrayList<Integer> list = new ArrayList<>();
    Syrialize(root, list);
    System.out.println(list);
  }
}
