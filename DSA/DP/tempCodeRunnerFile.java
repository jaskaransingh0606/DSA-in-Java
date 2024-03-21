public static int knapsack(int m, int[] profit, int[] weight, int n) {
    //     // Base condition
    //     if (m == 0 || n == 0) {
    //         return 0;
    //     }
    //     // If the weight of the nth item is greater than the knapsack capacity
    //     if (weight[n - 1] > m) {
    //         return knapsack(m, profit, weight, n - 1);
    //     } else {
    //         return Math.max(knapsack(m, profit, weight, n - 1),
    //                 profit[n - 1] + knapsack(m - weight[n - 1], profit, weight, n - 1));
    //     }
    // }