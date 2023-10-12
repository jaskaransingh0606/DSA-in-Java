//finding first occurence of an element in a sorted array using binary search

// Time Complexity: O(logn)
// Space Complexity: O(1)

import java.util.*;

public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 3, 4, 5, 6, 6, 7, 7, 7, 8 };
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter element to be searched");

        int x = sc.nextInt();

        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (arr[mid] == x) {
                result = mid;

                end = mid - 1;

            } else if (arr[mid] > x) {
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }
        }

        System.out.println("First occurence of " + x + " is at index " + result);

    }

}
