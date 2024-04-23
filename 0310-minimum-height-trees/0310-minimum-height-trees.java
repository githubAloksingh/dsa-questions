class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) {
            return Collections.singletonList(0); // Only one node, return the root
        }
        
        Map<Integer, List<Integer>> graph = new HashMap<>();
        int[] degrees = new int[n];
        
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
            degrees[u]++;
            degrees[v]++;
        }
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (degrees[i] == 1) {
                queue.offer(i);
            }
        }
        
        int remainingNodes = n;
        while (remainingNodes > 2) {
            int size = queue.size();
            remainingNodes -= size;
            
            for (int i = 0; i < size; i++) {
                int leaf = queue.poll();
                if (graph.containsKey(leaf)) {
                    for (int neighbor : graph.get(leaf)) {
                        degrees[neighbor]--;
                        if (degrees[neighbor] == 1) {
                            queue.offer(neighbor);
                        }
                    }
                    graph.remove(leaf); // Optional: Remove leaf node from the graph
                }
            }
        }
        
        return new ArrayList<>(queue);
    }
}