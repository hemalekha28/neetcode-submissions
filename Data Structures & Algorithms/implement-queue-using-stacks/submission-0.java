class MyQueue {
    Stack<Integer> stk1=new Stack<>();
    Stack<Integer> stk2=new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        while(!stk1.isEmpty()){
            int v1=stk1.pop();
            stk2.push(v1);
        }
        stk2.push(x);
        while(!stk2.isEmpty()){
            int v1=stk2.pop();
            stk1.push(v1);
        }
    }
    
    public int pop() {
        int v1=stk1.pop();
        return v1;
    }
    
    public int peek() {
        return stk1.peek();
    }
    
    public boolean empty() {
        return stk1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */