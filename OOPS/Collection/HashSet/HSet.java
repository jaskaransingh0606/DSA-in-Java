import java.util.HashSet;
import java.util.LinkedHashSet;

public class HSet {
    public static void main(String[] args){
        HashSet hs = new HashSet();                 // does not maintain insertion order
        hs.add(100);
        hs.add(200);
        hs.add(300);
        hs.add(400);
        System.out.println(hs);

        LinkedHashSet lhs = new LinkedHashSet();   // maintains insertion order
        lhs.add(100);
        lhs.add(200);
        lhs.add(300);
        lhs.add(400);
        System.out.println(lhs);
    }
    
}
