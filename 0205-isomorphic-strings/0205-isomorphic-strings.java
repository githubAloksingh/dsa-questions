class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character, Character> sToTMapping = new HashMap<>();
        Map<Character, Character> tToSMapping = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sToTMapping.containsKey(sChar)) {
                if (sToTMapping.get(sChar) != tChar) {
                    return false; 
                }
            } else {
                sToTMapping.put(sChar, tChar);
            }

            if (tToSMapping.containsKey(tChar)) {
                if (tToSMapping.get(tChar) != sChar) {
                    return false; 
                }
            } else {
                tToSMapping.put(tChar, sChar);
            }
        }

        return true;
    }
}
