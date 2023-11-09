// Time Complexity: O(nlogn) for insertion and O(logn) for searching
// Space Complexity: O(n) for storing n key value pairs

import java.util.*;

public class TreeMaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of key value pairs: ");
        TreeMap<Integer,String> map = new TreeMap<>();
        int n = sc.nextInt();

        for(int i=0;i<n;i++){

            System.out.println("Enter the key: ");
            int key = sc.nextInt();
            System.out.println("Enter the value: ");
            String value = sc.next();
            map.put(key,value);

        }

        System.out.println("The key value pairs are: " + map);
    }
    
}
