import java.util.*;

public class SlidingWindow {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] r = new int[n - k + 1];
        int j = 0;
        Deque<Integer> q = new ArrayDeque<Integer>();

        for (int i = 0; i < n; i++) {
            // remove the element which is out of window

            if (!q.isEmpty() && q.peek() == i - k) {
                q.poll();
            }
            // remove the element which is smaller than the current element
            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }
            q.offer(i);

            // add the element to the result
            if (i >= k - 1) {
                r[j++] = nums[q.peek()];
            }
        }

        return r;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 }; // 1, 3, 3, 5, 5, 6, 7
        int k = 3;
        int[] ans = maxSlidingWindow(arr, k);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

}
