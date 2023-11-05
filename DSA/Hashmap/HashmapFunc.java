import java.util.HashMap;

public class HashmapFunc {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Functinality of put() method

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "c");

        System.out.println("Initial Map: " + map);

        // Functonality of get() method

        String result = map.get(3);
        System.out.println("The value mapped to key 3 is: " + result);

        // Functionality of containsKey() method
        System.out.println("Is key 3 present? " + map.containsKey(3));

        // Functionality of remove() method

        map.remove(1);
        System.out.println("Updated Map: " + map);

        // Functionality of entrySet() method

        for(HashMap.Entry<Integer, String> e : map.entrySet()) {
            System.out.println("Hashmap is : ");
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }

}
