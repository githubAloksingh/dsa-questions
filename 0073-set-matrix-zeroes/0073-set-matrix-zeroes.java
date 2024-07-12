class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean rows[]=new boolean[m];
        boolean columns[] = new boolean[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    rows[i]=true;
                    columns[j]=true;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(rows[i] || columns[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}