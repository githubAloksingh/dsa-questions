class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        if(n<2){
            return 0;
        }
        Arrays.sort(nums);
        int diff=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            diff=nums[i+1]-nums[i];
            maxi=Math.max(maxi,diff);
            //diff=0;
            
        }
        return maxi;
        
    }
}