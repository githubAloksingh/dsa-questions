class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       int n=temperatures.length;
        int result[] = new int [n];
        int k=0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                int index=st.pop();
                result[index]=i-index;
            }
            st.push(i);
        }
        return result;
      
    }
}
