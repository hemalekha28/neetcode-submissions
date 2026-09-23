class Solution {
    public String minWindow(String s, String t) {
        int m=t.length();
        int n=s.length();
        int l=0,r=0,cnt=0,st=-1;
        int min=Integer.MAX_VALUE;
        Map<Character,Integer> mpp=new HashMap<>();
        for(char ch : t.toCharArray()){
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
        }
        while(r<n){
            char chr=s.charAt(r);
            if(mpp.containsKey(chr) ){
                if(mpp.get(chr)>0) cnt++;
                mpp.put(chr,mpp.get(chr)-1);
            }
            while(cnt==m){
                if(r-l+1<min){
                    min=r-l+1;
                    st=l;
                }
                if(mpp.containsKey(s.charAt(l))){
                    mpp.put(s.charAt(l),mpp.get(s.charAt(l))+1);
                    if(mpp.get(s.charAt(l))>0) cnt--;
                }
                l++;
            }
            r++;
        }
        return st==-1 ? "" : s.substring(st,st+min);
    }
}
