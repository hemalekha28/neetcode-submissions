class Solution {
    public void func(int ind,List<Integer>lst,List<List<Integer>> res,int[] nums,int n){
        if(ind>=n){
            res.add(new ArrayList<>(lst));
            return;
        }
        lst.add(nums[ind]);
        func(ind+1,lst,res,nums,n);
        lst.remove(lst.size()-1);
        func(ind+1,lst,res,nums,n);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> lst=new ArrayList<>();
        int n=nums.length;
        func(0,lst,res,nums,n);
        return res;
    }
}
