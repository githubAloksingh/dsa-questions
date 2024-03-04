public class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score = 0;
        Arrays.sort(tokens);
        Deque<Integer> deque = new LinkedList<>();

        for (int token : tokens) {
            deque.add(token);
        }

        while (!deque.isEmpty()) {
            if (power >= deque.peekFirst()) {
                power -= deque.pollFirst();
                score++;
            } else if (deque.size() > 1 && score > 0) {
                power += deque.pollLast();
                score--;
            } else {
                return score;
            }
        }
        return score;
    }
}