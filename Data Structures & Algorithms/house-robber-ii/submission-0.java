class Solution {
     public int rob1(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        int[] dp=new int[n];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return Math.max(dp[n-1],dp[n-2]);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        int[] n1=new int[n-1];
        int[] n2=new int[n-1];
        for(int i=0;i<n-1;i++){
            n1[i]=nums[i];
        }
        for(int i=1;i<n;i++){
            n2[i-1]=nums[i];
        }
        int m1=rob1(n1);
        int m2=rob1(n2);
        return Math.max(m1,m2);
    }
}
