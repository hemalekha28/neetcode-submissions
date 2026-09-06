class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int left=0,right=0;right<arr.length;right++){
            sum=sum+arr[right];
            while(sum>=target){
                min=Math.min(min,right-left+1);
                sum-=arr[left++];
            }
        }
        return min==Integer.MAX_VALUE ? 0 : min;
    }
}