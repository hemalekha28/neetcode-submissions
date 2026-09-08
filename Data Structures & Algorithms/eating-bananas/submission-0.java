class Solution {
    public boolean canEat(int m,int[] arr,int h){
        int s=0;
        for(int i=0;i<arr.length;i++){
            s+=(int)Math.ceil((double)arr[i]/m);
            if(s>h){
                return false;
            }
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        Arrays.sort(piles);
        int low=1;
        int high=piles[n-1];
        while(low<=high){
            int mid=(low+high)/2;
            if(!canEat(mid,piles,h)){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;

    }
}
