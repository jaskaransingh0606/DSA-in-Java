import java.util.*;

public class HashT {
    public static void main(String[] args) {
        Hashtable ht=new Hashtable();
        ht.put(1, "hello");      // key can a string or an integer.
        ht.put(2, "world");
        ht.put(3, "pw");
        ht.put(4, "java");
        ht.putIfAbsent(2, "world");   // putIfAbsent() method inserts the specified value with the specified key in the map only if it is not already specified.

        System.out.println(ht);

        // to always preserve the order of insertion use LinkedHashMap.
        }
    
}
