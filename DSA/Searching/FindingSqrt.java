// Finding square root of a number using binary search

// Time Complexity: O(logn)
// Space Complexity: O(1)

import java.util.*;

public class FindingSqrt {

    public static int findSqrt(int num) {
        int start = 0;
        int end = num;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long val = mid * mid;

            if (val == num) {
                return mid;
            }

            else if (val < num) {
                // store the floor value also,incase the number is not a perfect square

                result = mid;
                start = mid + 1;

            }

            else {
                end = mid - 1;

            }

        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number whose square root is to be found");

        int x = sc.nextInt();

        int result = findSqrt(x);

        System.out.println("Square root of " + x + " is " + result);
    }

}
