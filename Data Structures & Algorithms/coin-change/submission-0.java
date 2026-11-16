class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[] dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        Arrays.sort(coins);
        for(int i=0;i<n;i++){
            int j=coins[i];
            for(int ind=j;ind<=amount;ind++){
                int nc=1+dp[ind-j];
                dp[ind]=Math.min(dp[ind],nc);
            }
        }
        return dp[amount]==amount+1?-1:dp[amount];
    }
}
