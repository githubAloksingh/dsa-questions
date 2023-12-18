class Solution {
    public List<Integer> findLonely(int[] nums) {
      
            List<Integer> al = new ArrayList<>();
       Map<Integer, Integer> map = new HashMap<>();
         for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value == 1 && 
                !map.containsKey(key - 1) &&
                !map.containsKey(key + 1)) {
                al.add(key);
            }
        }
        
        return al;
    }
}
