class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mpp=new HashMap<>();
        for(String s : strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String k=new String(ch);
            if(!mpp.containsKey(k)){
                mpp.put(k,new ArrayList<>());
            }
            mpp.get(k).add(s);
        }
        return new ArrayList<>(mpp.values());
    }
}
