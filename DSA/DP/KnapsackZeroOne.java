public class KnapsackZeroOne {

    // public static int knapsack(int m, int[] profit, int[] weight, int n) {
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
     
    //Memoization approach
    public static int knapSackMemo(int m, int[] weight, int[] profit, int n, int[][] dp) {
        if (n == 0 || m == 0) {
            return 0;
        }
        if (dp[n][m] != -1) {
            return dp[n][m];
        }

        if (weight[n - 1] > m) {
            dp[n][m] = knapSackMemo(m, weight, profit, n - 1, dp);
            return dp[n][m];
        } else {
            dp[n][m] = Math.max(knapSackMemo(m, weight, profit, n - 1, dp),
                    profit[n - 1] + knapSackMemo(m - weight[n - 1], weight, profit, n - 1,dp));
            return dp[n][m];
        }
    }

    public static int tabulation(int m , int[] weight , int[] profit , int n){
        int[][] dp = new int[n+1][m+1];

        for(int i=0 ; i<=n ; i++){
            for(int w=0 ; w<=m ; w++){
                if(w==0 || i==0){
                    dp[i][w] = 0 ; 
                }

                else if(weight[i-1] <= w){
                    dp[i][w] = Math.max(dp[i-1][w] , profit[i-1] + dp[i-1][w-weight[i-1]]);
                }
                else{
                    dp[i][w] = dp[i-1][w];
                }
                
            }
        }
        return dp[n][m];
    }

    public static int helper(int m, int[] weight, int[] profit, int n) {
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                dp[i][j] = -1;
            }
        }
        return knapSackMemo(m, weight, profit, n, dp);
    }

    public static void main(String[] args) {
        int[] profit = { 60, 100, 120 };
        int[] weight = { 10, 20, 30 };
        int m = 50;
        int n = profit.length;

        System.out.println("Maximum profit: " + tabulation(m, weight, profit, n));
    }

}
