class Solution {
    public int heightChecker(int[] heights) {
        int mismatch=0;
        int []sortedHeights=Arrays.copyOf(heights,heights.length);
        Arrays.sort(heights);
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=sortedHeights[i]){
                mismatch++;
            }
        }
        return mismatch;
    }
}