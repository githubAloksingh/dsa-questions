class Solution {
    public String longestCommonPrefix(String[] strs) {
        
     String reference = strs[0];
    int n = reference.length();

    
    for (int i = 0; i < n; i++) {
        char c = reference.charAt(i);

        
        for (int j = 1; j < strs.length; j++) {
            if (i == strs[j].length()||strs[j].charAt(i) != c) {
                return reference.substring(0, i);
            }
        }
    }

    
    return reference;
}
}
