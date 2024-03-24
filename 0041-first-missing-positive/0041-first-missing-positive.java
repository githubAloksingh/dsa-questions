class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int i=1;i<=set.size();i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return set.size()+1;
        
    }
}