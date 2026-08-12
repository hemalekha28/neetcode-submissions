class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mpp=new HashMap<>();
        int n=nums.length;
        int[] arr=new int[k];
        for(int i=0;i<n;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> lst=new ArrayList<>(mpp.entrySet());
        Collections.sort(lst,(a,b)-> b.getValue()-a.getValue());
        for(int i=0;i<k && i<lst.size();i++){
            arr[i]=lst.get(i).getKey();
        }
        return arr;
    }
}
