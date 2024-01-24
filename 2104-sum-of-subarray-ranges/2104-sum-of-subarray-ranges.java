class Solution {
    public long subArrayRanges(int[] nums) {
        long sum=0;
        for(int i=0;i<nums.length;i++){
            int mini=nums[i]; int maxi=nums[i];
            for(int j=i;j<nums.length;j++){
                maxi=Math.max(maxi,nums[j]);
                mini=Math.min(mini,nums[j]);
                sum+=maxi-mini;
            }
        }
        return sum;
        
    }
}