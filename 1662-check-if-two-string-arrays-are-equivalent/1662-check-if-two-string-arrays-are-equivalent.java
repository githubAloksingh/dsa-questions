class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder word_1 =new StringBuilder();
        StringBuilder word_2 =new StringBuilder();
        for(String str:word1){
            word_1.append(str);
        }
         for(String str:word2){
            word_2.append(str);
        }
        return word_1.toString().equals(word_2.toString());
        
    }
}
