class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int k=-(nums[i]+nums[j]);
                if(set.contains(k)){
                    List<Integer> l=new ArrayList<>(Arrays.asList(nums[i],nums[j],k));
                    Collections.sort(l);
                    res.add(l);
                }
                set.add(nums[j]);
            }
        }
        return new ArrayList<>(res);
    }
}
