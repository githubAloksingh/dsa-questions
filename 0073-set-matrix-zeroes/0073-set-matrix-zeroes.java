public class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] copy = new int[m][n];
        
        // Copy the original matrix into the copy matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                copy[i][j] = matrix[i][j];
            }
        }
        
        // Traverse the original matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If an element in the original matrix is 0,
                // set the corresponding row and column in the copy matrix to 0
                if (matrix[i][j] == 0) {
                    // Set the entire row to 0
                    for (int k = 0; k < n; k++) {
                        copy[i][k] = 0;
                    }
                    // Set the entire column to 0
                    for (int k = 0; k < m; k++) {
                        copy[k][j] = 0;
                    }
                }
            }
        }
        
        // Copy the modified copy matrix back to the original matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = copy[i][j];
            }
        }
    }
}
