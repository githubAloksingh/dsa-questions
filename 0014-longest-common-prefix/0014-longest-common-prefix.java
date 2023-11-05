class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ref=strs[0];
        int n=ref.length();
        for(int i=0;i<n;i++){
            char c=ref.charAt(i);
            
            for(int j=1;j<strs.length;j++){
                if(i==strs[j].length() || strs[j].charAt(i)!=c){
                    return ref.substring(0,i);
                }
            }
        }
        return ref;
        
        
    }
}
  