class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        for (char digit : num.toCharArray()) {
            while (k > 0 && !stack.isEmpty() && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }
        while (k > 0) {
            stack.pop();
            k--;
        }
        while (!stack.isEmpty() && stack.get(0) == '0') {
            stack.remove(0);
        }
        if (stack.isEmpty()) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        for (char digit : stack) {
            result.append(digit);
        }

        return result.toString();
    }
}