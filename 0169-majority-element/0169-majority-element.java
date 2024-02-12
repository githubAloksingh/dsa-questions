class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            int value=entry.getValue();
            int key=entry.getKey();
            if(value>nums.length/2){
                return key;
            }
        }
        return 0;
        
    }
}