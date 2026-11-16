class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        StringBuilder sb=new StringBuilder(strs[0]);
        for(int i=1;i<n;i++){
            String p=strs[i];
            int j=0;
            while(j<p.length() && j<sb.length() && p.charAt(j)==sb.charAt(j)) j++;
            sb.delete(j,sb.length());
            if(j==0) return "";
        }
        return sb.toString();
    }
}