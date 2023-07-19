
import java.util.*;

public class Array {

    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();

        ad.add(100);
        ad.add(200);
        ad.addFirst(10);
        ad.addLast(20);
        ad.add("Pw");
        ad.offer(250); // offer() method is used to insert the specified element into this deque if it
                       // is possible to do so immediately without violating capacity restrictions.
        System.out.println(ad);
    }

}
