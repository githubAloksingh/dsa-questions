class Solution {
    private Map<Integer, Integer> memo = new HashMap<>();

    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int ways = climbStairs(n - 1) + climbStairs(n - 2);
        memo.put(n, ways);

        return ways;
    }
}
