class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean isAllowed[]=new boolean[26];
        for(int i=0;i<allowed.length();i++){
            isAllowed[allowed.charAt(i)-'a']=true;
        }
        int count=0;
        for(String word:words){
            boolean consistent=true;
            for(int i=0;i<word.length();i++){
                if(!isAllowed[word.charAt(i)-'a']){
                    consistent=false;
                    break;
                }
            }
            if(consistent){
                count++;
            }
        }
        return count;
        
    }
}