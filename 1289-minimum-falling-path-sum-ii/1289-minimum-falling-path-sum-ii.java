class Solution {
    public int minFallingPathSum(int[][] arr) {
        int n = arr.length;
        
        // Create a DP array to store the minimum falling path sum
        int[][] dp = new int[n][n];
        
        // Copy the first row from the input array to the DP array
        for (int i = 0; i < n; i++) {
            dp[0][i] = arr[0][i];
        }
        
        // Iterate over each row starting from the second row
        for (int i = 1; i < n; i++) {
            // Iterate over each column
            for (int j = 0; j < n; j++) {
                // Initialize min value with maximum possible value
                int min = Integer.MAX_VALUE;
                
                // Iterate over each column in the previous row
                for (int k = 0; k < n; k++) {
                    // Exclude the current column (j)
                    if (k != j) {
                        // Find the minimum falling path sum ending at (i-1, k) and add the current value
                        min = Math.min(min, dp[i - 1][k]);
                    }
                }
                
                // Update the DP array with the minimum falling path sum
                dp[i][j] = min + arr[i][j];
            }
        }
        
        // Find the minimum falling path sum in the last row
        int minPathSum = Integer.MAX_VALUE;
        for (int num : dp[n - 1]) {
            minPathSum = Math.min(minPathSum, num);
        }
        
        return minPathSum;
    }
}
