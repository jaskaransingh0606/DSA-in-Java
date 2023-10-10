// Pallindrome of an array

// Time Complexity: O(n)
// Space Complexity: O(1)


public class Pallindrome {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 4, 6, 2, 1 };
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i - 1]) {
                System.out.println("Not a pallindrome");
                return;
            }
        }
        System.out.println("Pallindrome");
    }

}
