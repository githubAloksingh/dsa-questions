class MyQueue {
     private Stack<Integer> s1 = new Stack<>();
     private Stack<Integer> s2 = new Stack<>(); 
     private int front;
    
    public void push(int x) {
        if(s1.isEmpty()){
            front=x;
            }
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s2.push(x);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        
    }
    
    public int pop() {
        int res=s1.pop();
        if(!s1.isEmpty()){
            front=s1.peek();
        }
        return res;
        
    }
    
    public int peek() {
        return front;
        
    }
    
    public boolean empty() {
        return s1.isEmpty();
        
    }
}

