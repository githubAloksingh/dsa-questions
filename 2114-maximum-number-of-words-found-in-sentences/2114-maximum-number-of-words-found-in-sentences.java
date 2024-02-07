class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount = Integer.MIN_VALUE;
        for(String sentence : sentences){
            int count = 1;
            for(int i = 0; i < sentence.length(); i++) {
                if(sentence.charAt(i) == ' ') {
                    count++;
                }
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}