class Solution {
    public String defangIPaddr(String address) {
        StringBuilder ans=new StringBuilder();
        for(char character : address.toCharArray()){
             if (character == '.') {
                ans.append("[.]");
            }
            else{
                ans.append(character);
            }
            
        }
        return ans.toString();
    }
}

