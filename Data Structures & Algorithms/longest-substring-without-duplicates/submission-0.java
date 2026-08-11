class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen=0;
        Map<Character,Integer> mpp=new HashMap<>();
        for(int left=0,right=0;right<s.length();right++){
            char ch=s.charAt(right);
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
            while(mpp.get(ch)>1){
                char c=s.charAt(left);
                mpp.put(c,mpp.get(c)-1);
                left++;
                if(mpp.get(c)==0) mpp.remove(c);
            }
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}
