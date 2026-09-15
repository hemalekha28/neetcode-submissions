class MinStack {
    Stack<Pair> stk=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        int min=Integer.MAX_VALUE;
        if(stk.isEmpty()){
            min=val;
        }
        else{
            min=Math.min(val,stk.peek().min);
        }
        stk.push(new Pair(val,min));
    }
    
    public void pop() {
        stk.pop();
    }
    
    public int top() {
        return stk.peek().val;
    }
    
    public int getMin() {
         return stk.peek().min;
    }
}
class Pair{
    int val;
    int min;
    public Pair(int val,int min){
        this.val=val;
        this.min=min;
    }
}

