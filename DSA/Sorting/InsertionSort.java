// In Insertion Sort, we compare the current element with the previous elements and place it in the correct position.
// time complexity: O(n^2)
// space complexity: O(1)


public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 17, 6, 1 };

        insertionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

    }
}
