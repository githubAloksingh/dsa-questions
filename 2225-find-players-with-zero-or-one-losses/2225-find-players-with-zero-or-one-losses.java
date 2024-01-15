class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> losses = new HashMap<>();
        Map<Integer, Integer> winner = new HashMap<>();

        for (int[] match : matches) {
            losses.put(match[1], losses.getOrDefault(match[1], 0) + 1);
            winner.put(match[0], winner.getOrDefault(match[0], 0) + 1);
            
        }

        List<Integer> noLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();

        for (int i = 1; i <= 1000005; i++) {
            if (losses.containsKey(i)) {
                int numLosses = losses.get(i);
                if (numLosses == 1) {
                    oneLoss.add(i);
                }
            }
            else if(winner.containsKey(i) && !(losses.containsKey(i))){
                noLoss.add(i);
            }
            
        }

        return Arrays.asList(noLoss, oneLoss);
    }
}

 