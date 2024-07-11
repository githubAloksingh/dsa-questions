class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
            if(c==')'){
                StringBuilder sb = new StringBuilder();
                while(!st.isEmpty() && st.peek()!='('){
                
                sb.append(st.pop());
            }
                st.pop();
                for(char ch:sb.toString().toCharArray()){
                    st.push(ch);
                }
            }
            else{
                st.push(c);
            }
        }
        StringBuilder result = new StringBuilder();
        while(!st.isEmpty()){
            result.append(st.pop());
        }
        return result.reverse().toString();
    }
}