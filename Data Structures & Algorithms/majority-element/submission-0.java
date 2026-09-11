class Solution {
    public int majorityElement(int[] arr) {
        int n=arr.length;
        int cnt=0;
        int e=0;
        for(int i=0;i<n;i++){
            if(cnt==0){
                e=arr[i];
                cnt=1;
            }
            else if(e==arr[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int cnt1=0;
        for(int i=0;i<n;i++){
            if(e==arr[i]){
                cnt1++;
            }
        }
        if(cnt1>(n/2)) return e;
        return -1;
    }
}