class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i]))
                return nums[i];
            hs.add(nums[i]);
        }
        
    return -1;
    }
}


//  O(n^2) Time Limit Exceeded
class Solution {
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return nums[i];
                }
            }
        }
        return 0;


    }
}
