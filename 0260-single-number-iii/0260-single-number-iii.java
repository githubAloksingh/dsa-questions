class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!hash.contains(nums[i])){
                hash.add(nums[i]);
            }
            else if(hash.contains(nums[i])){
                hash.remove(nums[i]);
            }
        }
        int res[] =new int[hash.size()];
        int index=0;
        for(int num : hash){
            res[index++]= num;
            
        }
        return res;
        
    }
}