class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        StringBuilder str=new StringBuilder(strs[0]);
        for(int i=1;i<n;i++){
            String p=strs[i];
            int j=0;
            while(j<p.length() && j<str.length() && p.charAt(j)==str.charAt(j)){
                j++;
            }
            str.delete(j,str.length());
            if(str.length()==0) return "";
        }
        return str.toString();
    }
}