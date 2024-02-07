class Solution {
    public int[] runningSum(int[] nums) {
        int ans[]=new int [nums.length];
        int n=nums.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<=i;j++){
                sum+=nums[j];

            }
            ans[i]=sum;
        }
        return ans;
        
    }
}