import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println(queue);
        System.out.println(queue.peek());
        queue.remove();

        System.out.println(queue);
        System.out.println(queue.peek());
        queue.remove();

        System.out.println(queue);
        System.out.println(queue.peek());
        queue.remove();    
    }
}
