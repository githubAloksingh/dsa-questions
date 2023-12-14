class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> al =new ArrayList<Integer>();
        HashMap<Integer,Integer>map=new HashMap<>();
        int mini=n/3;
        for(int i=0;i<nums.length;i++){
            int value=map.getOrDefault(nums[i],0);
            map.put(nums[i],value+1);
        
        if(map.get(nums[i])>mini){
            if(!al.contains(nums[i])){
            al.add(nums[i]);
        }
        }
            
    }
        return al;
        
    }
}