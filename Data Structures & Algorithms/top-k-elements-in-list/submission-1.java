class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mpp=new HashMap<>();
        int n=nums.length;
        int[] arr=new int[k];
        for(int i=0;i<n;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)-> a.getValue()-b.getValue());
        for(Map.Entry<Integer,Integer> entry : mpp.entrySet()){
            pq.add(entry);
            if(pq.size()>k){
                pq.poll();
            }
        }
        for(int i=0;i<k;i++){
            arr[i]=pq.poll().getKey();
        }
        return arr; 
    }
}
