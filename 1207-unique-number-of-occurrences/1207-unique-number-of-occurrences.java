class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer> hs=new HashSet<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int value=entry.getValue();
            if(!hs.add(value)){
                return false;
            }
        }
        return true;
        
    }
}