class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int e1=0;
        int e2=0;
        int cnt1=0,cnt2=0;
        for(int i=0;i<n;i++){
            if(cnt1==0 && e2!=nums[i]){
                cnt1=1;
                e1=nums[i];
            }
            else if(cnt2==0 && e1!=nums[i]){
                cnt2=1;
                e2=nums[i];
            }
            else if(e1==nums[i]){
                cnt1++;
            }
            else if(e2==nums[i]){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        int c1=0,c2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==e1) c1++;
            if(nums[i]==e2) c2++;
        }
        int ngt=n/3+1;
        List<Integer> lst=new ArrayList<>();
        if(c1>=ngt) lst.add(e1);
        if(c2>=ngt && e1!=e2) lst.add(e2);
        return lst;
    }
}