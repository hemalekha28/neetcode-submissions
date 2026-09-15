class Solution {
    public int calPoints(String[] operations) {
        int n=operations.length;
        Stack<Integer> stk=new Stack<>();
        for(String op : operations){
            if(op.equals("C")){
                stk.pop();
            }
            else if(op.equals("D")){
                int c=stk.peek();
                stk.push(2*c);
            }
            else if(op.equals("+")){
                int v1=stk.peek();
                stk.pop();
                int v2=stk.peek();
                stk.push(v1);
                stk.push(v1+v2);
            }
            else{
                stk.push(Integer.parseInt(op));
            }
        }
        int s=0;
        while(stk.size()!=0){
            s+=stk.peek();
            stk.pop();
        }
        return s;
    }
}