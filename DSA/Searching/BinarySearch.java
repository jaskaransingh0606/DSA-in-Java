// Binary Search Algorithm
// We can use binary search only on sorted arrays.

// time complexity: O(logn)
// space complexity: O(1)

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int start = 0;
        int end = arr.length - 1;

        int x = 8;

        while (start <= end) {

            int mid = start + (end - start) / 2;  // to avoid integer overflow

            if (arr[mid] == x) {
                System.out.println("Element found at index " + mid);
                return;
            }

            else if (arr[mid] > x) {
                end = mid - 1;

            }

            else {
                start = mid + 1;
            }
        }
    }

}
