class Solution {
    public String firstPalindrome(String[] words) {
        for(String word:words){
           if(isItPalindrome(word)){
               return word;
           }
        }
        return "";
    }
    private boolean isItPalindrome(String word){
        int left=0;
        int right=word.length()-1;
        while(left<=right){
            if(word.charAt(left)!=word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}