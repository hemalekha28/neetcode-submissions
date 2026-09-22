class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> res=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                Set<Long> set=new HashSet<>();
                for(int k=j+1;k<n;k++){
                   long l = (long) target - ((long) nums[i] + nums[j] + nums[k]);
                   // long l=(long)target-(nums[i]+nums[j]+nums[k]);
                    if(set.contains(l)){
                        List<Integer> lst=new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k],(int)l));
                        Collections.sort(lst);
                        res.add(lst);
                    }
                    set.add((long)nums[k]);
                }
            }
        }
        return new ArrayList<>(res);
    }
}