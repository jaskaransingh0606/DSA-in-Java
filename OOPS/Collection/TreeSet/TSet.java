
import java.util.*;

public class TSet {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(200);
        ts.add(300);
        ts.add(400);
        ts.add(500);
        ts.add(600);
        System.out.println(ts);

        System.out.println(ts.higher(200));

    }

}
