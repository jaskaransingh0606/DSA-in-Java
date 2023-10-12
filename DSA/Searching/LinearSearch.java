//Linear Search in Java

// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of array");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to be searched");

        int x = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println("Element found at index " + i);
                return;
            }
        }

        System.out.println("Element not present in the array");
    }

}
