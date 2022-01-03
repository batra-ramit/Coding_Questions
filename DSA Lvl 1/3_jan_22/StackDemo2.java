import java.util.*;

public class StackDemo2 {
    public static void main(String[] args) {
        
        Stack<String> stack = new Stack<>();

        stack.push("hello");
        stack.push("world");
        stack.push("bye");

        while (stack.size() > 0) {
            String tos = stack.peek();
            System.out.println(tos);
            stack.pop();
        }

    }
}
