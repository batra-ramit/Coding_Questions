import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

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

    public static void LevelOrderLineWise(Node root) {

        Queue<Node> parent = new ArrayDeque<>();
        Queue<Node> child = new ArrayDeque<>();

        parent.add(root);
        while (parent.size() > 0) {
            Node temp = parent.remove();
            System.out.println(temp.data + " ");

            for (Node val : temp.children) {
                child.add(val);

            }

            if (parent.size() == 0) {
                parent = child;
                child = new ArrayDeque<>();
                System.out.println(".");
            }
        }

    }
    
    public static void LevelOrderZigZag(Node root) {

        Queue<Node> parent = new ArrayDeque<>();
        Queue<Node> child = new ArrayDeque<>();
        Stack<Node> bacha = new Stack<>();
        parent.add(root);
        int i = 1;
        while (parent.size() > 0) {

            Node temp = parent.remove();
            System.out.println(temp.data + " ");
            if (i % 2 == 0) {
                System.out.println(i + "--1");
                for (Node val : temp.children) {
                    child.add(val);

                }
            } else {
                for (Node val : temp.children) {
                    bacha.push(val);
                }
            }

            if (parent.size() == 0) {
                System.out.println(i + "--2");
                if (i % 2 == 0) {
                    parent = child;
                    child = new ArrayDeque<>();
                    System.out.println(".");
                } else {
                    parent = new ArrayDeque<>();
                    child = new ArrayDeque<>();
                    while (bacha.size() > 0) {
                        parent.add(bacha.pop());
                    }
                    bacha = new Stack<>();
                    System.out.println(".");
                }
                System.out.println(i + "--3");
                i++;
                System.out.println(i + "--4");
            }

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

   


    public static void main(String[] args) {
        
int[] arr={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};


       .add(n11);
        

        Node root = construct(arr);


        LevelOrderLineWise(root);

        ArrayList<Integer> list = new ArrayList<>();
        Syrialize(root, list);
        System.out.println(list);

    


    }
}
