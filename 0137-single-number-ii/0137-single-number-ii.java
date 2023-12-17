class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
       HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            int value=map.getOrDefault(nums[i],0);
            map.put(nums[i],value+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
            
        }
        return 0;
            //for (Map.Entry<String,Integer> mapElement : hm.entrySet()) {
        
    }
}