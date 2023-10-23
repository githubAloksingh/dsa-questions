class Solution {
    public int majorityElement(int[] nums) {
        // int n=nums.length;
        // for(int i=0;i<nums.length;i++){
        //     int count=0;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             count++;
        //          }
        // }
        //     if(count>n/2)
        //         return nums[i];
        // }
        // return -1;
        
        
        
//         HashMap<Integer, Integer> map = new HashMap<>();
//          int n=nums.length;
//         for (int i = 0; i < n; i++) {
//         int value = map.getOrDefault(nums[i], 0);
//             map.put(nums[i], value+1);
//         }
//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//             if (entry.getValue() > (n / 2)) {
//                 return entry.getKey();
        
//             }
//         }

//         return -1;
        
        int n=nums.length;
        int count=0;
        int el=nums[0];
        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                el=nums[i];
            }
            else if(nums[i]==el)
                count++;
            else
                count--;
        }
        return el;
    }
}



  
