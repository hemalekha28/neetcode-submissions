class Solution {
    public void func(int ind,List<List<Integer>> res,List<Integer> lst,int n,boolean[] vis,int[] nums){
        if(lst.size()==n){
            res.add(new ArrayList<>(lst));
            return;
        }
        for(int i=0;i<n;i++){
            if(vis[i]==false){
                vis[i]=true;
                lst.add(nums[i]);
                func(i+1,res,lst,n,vis,nums);
                vis[i]=false;
                lst.remove(lst.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> lst=new ArrayList<>();
        int n=nums.length;
        boolean[] vis=new boolean[n];
        Arrays.fill(vis,false);
        func(0,res,lst,n,vis,nums);
        return res;
    }
}
