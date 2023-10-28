 // In Selection Sort, we find the maximum element and place it at the end of the array.
// time complexity: O(n^2)
// space complexity: O(1)


public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 10, 1, 6, 3, 7, 8, 2 };
        selection(arr);
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

}
