class Solution {
    public String removeOuterParentheses(String s) {
        
        StringBuilder ans=new StringBuilder();
        int counterBalance=0;
        char d[]=s.toCharArray();
        for(char c:d){
            if(c=='('){
                if(counterBalance>0){
                    ans.append(c);
                }
                counterBalance++;
            }
            else if(c==')'){
                counterBalance--;
                if(counterBalance>0){
                    ans.append(c);
                }
            }
            }
        return ans.toString();
    }
}