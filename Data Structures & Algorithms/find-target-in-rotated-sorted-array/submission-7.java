class Solution {
    public int search(int[] arr, int t) {
        int low=0,high=arr.length-1;
        while(low<=high){
            int m=(low+high)/2;
            if(arr[m]==t) return m;
            if(arr[low]<=arr[m]){
                if(arr[low]<=t && arr[m]>t){
                    high=m-1;
                }
                else{
                    low=m+1;
                }
            }
            else{
                if(arr[m]<t && t<=arr[high]){
                    low=m+1;
                }
                else{
                    high=m-1;
                }
            }
        }
        return -1;
    }
}
