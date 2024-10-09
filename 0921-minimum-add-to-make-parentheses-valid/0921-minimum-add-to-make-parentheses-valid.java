import java.util.Stack;
class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        
        int i=0;
        int n= s.length();
        while(i<n){
            char ch=s.charAt(i);
            
            if(ch==')' && !st.isEmpty() && st.peek()=='('){
                st.pop();
            }
            else{
            st.push(ch);
            }
            i++;
    
            
        }
        return st.size();
        
        
    }
}




