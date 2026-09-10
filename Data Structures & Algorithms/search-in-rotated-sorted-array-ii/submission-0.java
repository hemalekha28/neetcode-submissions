class Solution {
    public boolean search(int[] arr, int t) {
        int n=arr.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==t) return true;
            if(arr[mid]==arr[low] && arr[mid]==arr[high]){
                low++;
                high--;
                continue;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<=t && t<=arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(t>=arr[mid] && t<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
}