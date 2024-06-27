import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < edges.length; i++) {
            for (int j = 0; j < edges[i].length; j++) {
                int node = edges[i][j];
                map.put(node, map.getOrDefault(node, 0) + 1);
            }
        }
        
        int mostFrequent = -1;
        int maxFrequency = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
        return mostFrequent;
    }
}
