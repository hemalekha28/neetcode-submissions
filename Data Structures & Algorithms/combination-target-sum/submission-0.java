class Solution {
    public void func(int ind,int[] nums,List<Integer> lst,List<List<Integer>> res,int sum,int target,int n){
        if(ind>=n || sum>target){
           // sum=sum-lst.size()-1;
            return;
        }
        if(sum==target){
            res.add(new ArrayList<>(lst));
            return;
        }
        lst.add(nums[ind]);
        func(ind,nums,lst,res,sum+nums[ind],target,n);
        //sum=sum-lst.size()-1;
        lst.remove(lst.size()-1);
        func(ind+1,nums,lst,res,sum,target,n);

    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> lst=new ArrayList<>();
        int n=nums.length;
        int sum=0;
        func(0,nums,lst,res,sum,target,n);
        return res;
    }
}
