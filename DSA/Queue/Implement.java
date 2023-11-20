import java.util.*;

public class Implement {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            q.add(i); // add() method is used to add elements to the queue
        }

        System.out.println(q); // printing the queue
        System.out.println(q.peek()); // printing the top element of the queue

        q.remove(); // remove() method is used to remove elements from the queue
        System.out.println(q.peek());
        System.out.println("The size is " + q.size());

    }

}
