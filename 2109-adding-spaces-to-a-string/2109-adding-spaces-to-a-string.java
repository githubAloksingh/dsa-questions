class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder result = new StringBuilder();
        int space_index=0;
        for(int i=0;i<s.length();i++){
            if(space_index<spaces.length && i==spaces[space_index]){
                result.append(' ');
                space_index++;
            }
            result.append(s.charAt(i));
        }
        return result.toString();
        
    }
}

