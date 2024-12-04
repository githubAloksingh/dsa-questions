class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int m =str1.length();
        int n =str2.length();
        int j=0;
        for(int i=0; i<m&&j<n; i++){
            char currentChar=str1.charAt(i);
            char incrementedChar=(char)((currentChar-'a' +1)%26+'a');
            if(currentChar==str2.charAt(j) || incrementedChar==str2.charAt(j)){
                j++;
            }
        }
        return j==n;
        
        
    }
}