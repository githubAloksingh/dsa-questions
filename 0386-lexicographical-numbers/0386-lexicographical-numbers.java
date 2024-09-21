class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            result.add(i);
        }
        
        // Sort the list lexicographically
        result.sort((a, b) -> String.valueOf(a).compareTo(String.valueOf(b)));
        
        return result;
    }

    
}
