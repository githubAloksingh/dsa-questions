class Solution {
    public int minSteps(String s, String t) {
        int count[]=new int[26];
        int ans=0;
        for(int i=0;i<s.length();i++){
            count[t.charAt(i)-'a']++;
            count[s.charAt(i)-'a']--;
        }
        for(int i:count){
            if(i>0){
                ans+=i;
            }
        }
        return ans;
        
    }
}