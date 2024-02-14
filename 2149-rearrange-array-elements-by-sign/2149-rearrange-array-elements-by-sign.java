class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int positive_value=0;
        int negative_value=n/2;
        int temp[]=new int[nums.length];
        int ans[]=new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                temp[positive_value++]=nums[i];
            }
            else{
                temp[negative_value++]=nums[i];
            }
        }
            for(int i=0;i<n/2;i++){
                ans[k++]=temp[i];
                ans[k++]=temp[(n/2)+i];
            }
        return ans;
        
    }
}