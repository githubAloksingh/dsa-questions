class Solution {
    public int longestSubarray(int[] nums) {
        // Find the maximum element in the array
        int maxVal = Integer.MIN_VALUE;
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
        }
        
        // Find the length of the longest subarray containing only the maxVal
        int maxLength = 0;
        int currentLength = 0;
        for (int num : nums) {
            if (num == maxVal) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 0;
            }
        }
        
        return maxLength;
    }
}
