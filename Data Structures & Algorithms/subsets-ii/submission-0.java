class Solution {
    public void func(int ind,List<Integer>lst,Set<List<Integer>> res,int[] nums,int n){
        if(ind>=n){
            res.add(new ArrayList<>(lst));
            return;
        }
        lst.add(nums[ind]);
        func(ind+1,lst,res,nums,n);
        lst.remove(lst.size()-1);
        func(ind+1,lst,res,nums,n);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res=new HashSet<>();
        List<Integer> lst=new ArrayList<>();
        int n=nums.length;
        func(0,lst,res,nums,n);
        return new ArrayList<>(res);
    }
}
