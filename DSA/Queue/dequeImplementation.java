
import java.util.*;

public class dequeImplementation {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<Integer>();
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        System.out.println("dq output" + dq);

        dq.removeFirst();
        System.out.println("dq output after deletion " + dq);

    }
    
}
