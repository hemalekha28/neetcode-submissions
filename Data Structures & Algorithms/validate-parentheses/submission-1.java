class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){
                stk.push(ch);
            }
            else{
                if(stk.isEmpty()) return false;
                char ch1=stk.peek();
                stk.pop();
                if((ch==')' && ch1!='(') || (ch==']' && ch1!='[') || (ch=='}' && ch1!='{') ){
                    return false;
                }
            }
        }
        return stk.isEmpty();
    }
}
