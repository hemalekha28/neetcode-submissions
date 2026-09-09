class Solution {
    public boolean canship(int[] arr,int m,int days){
        int s=0,d=1;
        for(int i=0;i<arr.length;i++){
            if(s+arr[i]>m){
                d++;
                s=arr[i];
            }
            else{
                s+=arr[i];
            }
        }
        return d<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=0,high=0;
        for(int num : weights){
            low=Math.max(low,num);
            high+=num;
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(canship(weights,mid,days)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}