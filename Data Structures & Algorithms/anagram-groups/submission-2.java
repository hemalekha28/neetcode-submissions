class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         List<List<String>> res=new ArrayList<>();
         Map<String,List<String>> mpp=new HashMap<>();
         for(String s : strs){
           // String t=s;
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String t=new String(arr);
            if(!mpp.containsKey(t)){
                mpp.put(t,new ArrayList<>());
            }
                mpp.get(t).add(s);
         }
         return new ArrayList<>(mpp.values());
    }
}
