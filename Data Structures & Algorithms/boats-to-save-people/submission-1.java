class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n=people.length;
        int cnt=0;
        int l=0,r=n-1;
        Arrays.sort(people);
        while(l<=r){
            if(people[l]+people[r]<=limit){
                l++;
                r--;
                cnt++;
            }else{
            cnt++;
            r--;}

        }
        return cnt;
    }
}