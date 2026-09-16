class StockSpanner {
    Stack<Pair> stk=new Stack<>();
    int ind;
    public StockSpanner() {
        ind=-1;
    }
    public int next(int price) {
        ind=ind+1;
        while(!stk.isEmpty() && stk.peek().val<=price){
            stk.pop();
        }
        int ans;
                // No greater price on the left
        if (stk.isEmpty()) {
            ans = ind + 1;
        } 
        else {
            // Nearest greater price on the left
            ans = ind - stk.peek().ind;
        }

        stk.push(new Pair(price,ind));
        return ans;
    }
}
class Pair{
    int val;
    int ind;
    Pair(int val,int ind){
        this.val=val;
        this.ind=ind;
    }
}
