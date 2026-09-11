class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mpp=new HashMap<>();
        for(int num : nums){
            mpp.put(num,mpp.getOrDefault(num,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        for(Map.Entry<Integer,Integer> entry : mpp.entrySet()){
            pq.add(entry);
        }
        int[] arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=pq.poll().getKey();
        }
        return arr;
    }
}
