// In Bubble Sort, we compare adjacent elements and swap them if they are not in the intended order.
// time complexity: O(n^2)
// space complexity: O(1)


public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 17, 6, 1 };

        bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }
}
