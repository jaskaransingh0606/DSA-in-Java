import java.util.HashMap;

public class HashM {
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        hm.put(1, "hello");      // key can a string or an integer.
        hm.put(2, "world");
        hm.put(3, "pw");
        hm.put(4, "java");

        System.out.println(hm);
    }

    // to always preserve the order of insertion use LinkedHashMap.
    
}
