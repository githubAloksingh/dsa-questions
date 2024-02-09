class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int value=entry.getValue();
            int key=entry.getKey();
            if(value==1){
                sum+=key;
            }
        }
        return sum;
    }
}