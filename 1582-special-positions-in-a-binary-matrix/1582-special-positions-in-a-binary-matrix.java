class Solution {
    public int numSpecial(int[][] mat) {


        int m = mat.length;
        int n = mat[0].length;
        int[] rowCheck = new int[m];
        int[] colCheck= new int[n];
        int special_position = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rowCheck[i] += mat[i][j];
                colCheck[j] += mat[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1 && rowCheck[i] == 1 && colCheck[j] == 1) {
                    special_position++;
                }
            }
        }

        return special_position;
    }
}

       