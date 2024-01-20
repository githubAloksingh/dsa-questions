class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        Queue<Character> heap=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(char key:map.keySet()){
            heap.add(key);
        }
        StringBuilder ans=new StringBuilder();
        while(!heap.isEmpty()){
            char c=heap.poll();
           int frequency=map.get(c);
            for(int i=0;i<frequency;i++){
                ans.append(c);
                }
        }
        return ans.toString();
        
    }
}


