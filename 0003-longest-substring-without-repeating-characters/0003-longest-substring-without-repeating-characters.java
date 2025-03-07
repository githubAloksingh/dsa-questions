class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set =new HashSet<>();
        int i=0, j=0, maxi=0;
        int n =s.length(); 
        while(i<n && j<n){
            if(!set.contains(s.charAt(j))){ 
                set.add(s.charAt(j++));
                maxi = Math.max(maxi, j-i);
            }
            else{
                set.remove(s.charAt(i++));
            }
        }
        return maxi;
    }
}



      
