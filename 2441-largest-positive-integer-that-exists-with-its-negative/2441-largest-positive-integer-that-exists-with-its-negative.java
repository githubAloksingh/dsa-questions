class Solution {
    public int findMaxK(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maxi = -1;
        for(int num:nums){
            if(map.containsKey(-num) && map.get(num) >= 1 && map.get(-num) >= 1){
                maxi = Math.max(maxi, Math.abs(num));
            }
        }
        return maxi;
    }
}