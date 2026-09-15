class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk=new Stack<>();
        for(String op : tokens){
            if(op.equals("*")){
                int v1=stk.pop();
                int v2=stk.pop();
                int v3=v1*v2;
                stk.push(v3);
            }else if(op.equals("+")){
                int v1=stk.pop();
                int v2=stk.pop();
                int v3=v1+v2;
                stk.push(v3);
            }else if(op.equals("/")){
                int v1=stk.pop();
                int v2=stk.pop();
                int v3=0;
                if(v2!=0) v3=v2/v1;
                stk.push(v3);
            }else if(op.equals("-")){
                int v1=stk.pop();
                int v2=stk.pop();
                int v3=v2-v1;
                stk.push(v3);
            }
            else{
                stk.push(Integer.parseInt(op));
            }
        }
        return stk.pop();
    }
}
