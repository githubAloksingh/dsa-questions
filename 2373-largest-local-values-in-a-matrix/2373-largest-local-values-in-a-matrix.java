class Solution {
    private int findMax(int[][] grid, int x, int y){
        int maxVal=0;
        for(int i=x;i<x+3;i++){
            for(int j=y;j<y+3;j++){
                maxVal=Math.max(maxVal,grid[i][j]);
            }
        }
        return maxVal;
    }
    
    
    
    public int[][] largestLocal(int[][] grid) {
        int N=grid.length;
        int maxLocal[][]= new int[N-2][N-2];
        for(int i=0;i<N-2;i++){
            for(int j=0;j<N-2;j++){
                int maxValue=findMax(grid, i, j);
                maxLocal[i][j]=maxValue;
            }
        }
        return maxLocal;
    }
}