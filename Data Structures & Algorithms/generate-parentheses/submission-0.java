class Solution {
    public void func(int n,StringBuilder sb,List<String> res,int open,int close){
        if((open==n) && (close==n)){
            res.add(sb.toString());
            return;
        }
        if(open<n){
            sb.append("(");
            func(n,sb,res,open+1,close);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            sb.append(")");
            func(n,sb,res,open,close+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        StringBuilder sb=new StringBuilder("(");
        int open=1,close=0;
        func(n,sb,res,open,close);
        return res;
    }
}
