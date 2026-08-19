class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        int max=0;
        for(int i=0;i<nums.length;i++){
            int cnt=0;
            if(!set.contains(nums[i]-1)){
                int s=nums[i];
                cnt++;
                while(set.contains(s+1)){
                    s+=1;
                    cnt++;
                }
                max=Math.max(cnt,max);
            }
            else{
                continue;
            }
        }
        return max;
    }
}
