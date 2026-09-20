class Solution {
    public void swap(int[] arr,int s,int e){
        int t=arr[s];
        arr[s]=arr[e];
        arr[e]=t;
    }
    public void sortColors(int[] arr) {
        int n=arr.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid]==1) mid++;
            else if(arr[mid]==2){
                swap(arr,mid,high);
                high--;
            }
        }
    }
}