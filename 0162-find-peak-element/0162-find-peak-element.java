class Solution {
    public int findPeakElement(int[] nums) {
        Stack<Integer>s=new Stack<>();
            s.push(nums[0]);
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(!s.isEmpty() && (int)s.peek()<nums[i]){
                s.pop();
            s.push(nums[i]);
                k=i;
            }
        }
        return k;
    }
}
