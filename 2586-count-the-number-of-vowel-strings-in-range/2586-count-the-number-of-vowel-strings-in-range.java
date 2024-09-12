class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            int n=words[i].length();
            if(isVowel(words[i].charAt(0))){
                if(isVowel(words[i].charAt(n-1))){
                    count++;
                }
            }
        }
        return count;
        
    }
    private boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        return false;
    }
}