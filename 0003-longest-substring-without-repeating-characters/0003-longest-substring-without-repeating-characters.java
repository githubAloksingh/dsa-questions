class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left=0;
        int maxi=0;
        for(int right=0;right<s.length();right++){
            if(map.containsKey(s.charAt(right))){
                left=Math.max(left,map.get(s.charAt(right))+1);
            }
            map.put(s.charAt(right),right);
            maxi=Math.max(maxi,right-left+1);
            
        }
        return maxi;
        
    }
}
































// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int n = s.length();
//         int maxSubstringLength = 0;
//         HashMap<Character, Integer> charIndexMap = new HashMap<>();
        
//         for (int right = 0, left = 0; right < n; right++) {
//             char currentChar = s.charAt(right);
//             if (charIndexMap.containsKey(currentChar)) {
               
//                 left = Math.max(left, charIndexMap.get(currentChar) + 1);
//             }
//             charIndexMap.put(currentChar, right);
//             maxSubstringLength = Math.max(maxSubstringLength, right - left + 1);
//         }
        
//         return maxSubstringLength;
//     }
// }
