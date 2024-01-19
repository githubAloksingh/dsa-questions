class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int n=nums.length;
        int result[]=new int[n];
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
           ans=search(nums,val,i);
           result[i]=ans;
           
        }
        return result;
        }

        public int search(int []nums,int val,int start){
            int n=nums.length;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==val){
                    for(int j=start+1;j<start+n;j++){
                        int index=j%n;
                        if(nums[index]>val){
                            return nums[index];
                        }
                    }
                }
            }
            return -1;
        }
}







