class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        int maxi=nums[0];
        if(nums.length<=2){
            return -1;
        }
        else{
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxi){
                maxi=nums[i];
                break;
            }
        } 
        }
            return maxi;
        }
    }