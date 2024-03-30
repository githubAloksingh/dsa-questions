class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        
        int[] distinctCount = new int[nums.length + 1];

        int totalCount = 0;
        int left = 0;
        int right = 0;
        int currCount = 0;

        while (right < nums.length) {
            if (distinctCount[nums[right++]]++ == 0) {
                
                k--;
            }
            if (k < 0) {
                
                --distinctCount[nums[left++]];
                k++;
                currCount = 0;
            }
            if (k == 0) {
                while (distinctCount[nums[left]] > 1) {
                    --distinctCount[nums[left++]];
                    currCount++;
                }
                totalCount += (currCount + 1);
            }
        }
        return totalCount;
    }
}