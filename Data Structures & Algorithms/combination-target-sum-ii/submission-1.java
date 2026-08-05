class Solution {
     public void func(int ind,int[] nums,List<Integer> lst,Set<List<Integer>> res,int sum,int target,int n){
        if(sum==target){
            res.add(new ArrayList<>(lst));
            return;
        }
        for(int i=ind;i<n;i++){
            if(i>ind && nums[i]==nums[i-1]) continue;
            if(sum+nums[i]>target) break;
            lst.add(nums[i]);
            func(i+1,nums,lst,res,sum+nums[i],target,n);
            lst.remove(lst.size()-1);
        }

    }
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> res=new HashSet<>();
        List<Integer> lst=new ArrayList<>();
        int n=nums.length;
        int sum=0;
        func(0,nums,lst,res,sum,target,n);
        return new ArrayList<>(res);
    }
}
