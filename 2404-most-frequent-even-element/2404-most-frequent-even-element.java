class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
         int maxFrequency = 0;
         int mostFrequentNumber = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value > maxFrequency || (value == maxFrequency && key < mostFrequentNumber)) {
                mostFrequentNumber = key;
                maxFrequency = value;
            }
        }

        return mostFrequentNumber;
           
        
    }
}

