class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        if(n==1) return s;
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){
            dp[i][i]=1;
        }
        int start=0;
        int maxlen=1;
        for(int i=0;i<n-1;i++){
            int length2=0;
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=1;
                length2+=2;
                if(length2>maxlen){
                    maxlen=length2;
                    start=i;
                }
            }
        }
        int length=0;
        for(int len=3;len<=n;len++){
            for(int i=0;i<=n-len;i++){
                int j=i+len-1;
                if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==1){
                    dp[i][j]=1;
                    length=j-i+1;
                    if(length>maxlen){
                    start=i;
                    maxlen=length;
                }
                }
                
            }
        }
        return s.substring(start,start+maxlen);
    }
}
