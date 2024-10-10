class Solution {

 private List<String> result = new ArrayList<>();

    private void solve(int n, StringBuilder curr, int open, int close) {
        if (curr.length() == 2 * n) {
            result.add(curr.toString());
            return;
        }

        if (open < n) {
            curr.append('(');
            solve(n, curr, open + 1, close);
            curr.deleteCharAt(curr.length() - 1);
        }
        if (close < open) {
            curr.append(')');
            solve(n, curr, open, close + 1);
            curr.deleteCharAt(curr.length() - 1);
        }
    }

    public List<String> generateParenthesis(int n) {
        StringBuilder curr = new StringBuilder();
        solve(n, curr, 0, 0);
        return result;
    }

    
}