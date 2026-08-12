class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mpp=new HashMap<>();
        for(String s : strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String keys=new String(ch);
            if(!mpp.containsKey(keys)){
                mpp.put(keys,new ArrayList<>());
            }
            mpp.get(keys).add(s);
        }
        return new ArrayList<>(mpp.values());
    }
}
