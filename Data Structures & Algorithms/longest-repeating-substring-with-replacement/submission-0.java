class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int maxLen=0;
        int maxFreq=0;
        Map<Character,Integer> mpp = new HashMap<>();
        for(int l=0,r=0;r<n;r++){
            char ch=s.charAt(r);
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
            maxFreq=Math.max(maxFreq,mpp.get(ch));
            while((r-l+1)-maxFreq>k){
                char c=s.charAt(l);
                mpp.put(c,mpp.get(c)-1);
                if(mpp.get(c)==0){
                    mpp.remove(c);
                }
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }
}
