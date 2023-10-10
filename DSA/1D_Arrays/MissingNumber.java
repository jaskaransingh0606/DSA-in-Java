// Find the missing number in the array of 1 to n elements

// Time Complexity: O(n)
// Space Complexity: O(1)

public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };

        int n = arr.length;

        int Arr_sum = 0;

        for (int i = 0; i < n; i++) {

            // finding the sum of the array elements
            Arr_sum = Arr_sum + arr[i];

        }
         // finding the sum of the elements from 1 to n+1 (n+1 because one element is missing)
        int Total_sum = (n + 1) * (n + 2) / 2;

        // finding the missing element
        int Missing_Element = Total_sum - Arr_sum;

        System.out.println("The missing element is " + Missing_Element);
    }

}
