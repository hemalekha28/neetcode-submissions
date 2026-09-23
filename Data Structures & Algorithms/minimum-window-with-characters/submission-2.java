class Solution {
    public String minWindow(String s, String t) {

        int n1 = s.length();
        int m = t.length();

        Map<Character, Integer> mpp = new HashMap<>();

        for (char ch : t.toCharArray()) {
            mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);
        }

        int l = 0, r = 0, cnt = 0;
        int st = -1, min = Integer.MAX_VALUE;

        while (r < n1) {

            char rightChar = s.charAt(r);

            if (mpp.containsKey(rightChar)) {

                if (mpp.get(rightChar) > 0) {
                    cnt++;
                }

                mpp.put(rightChar, mpp.get(rightChar) - 1);
            }

            while (cnt == m) {

                if (r - l + 1 < min) {
                    min = r - l + 1;
                    st = l;
                }

                char leftChar = s.charAt(l);

                if (mpp.containsKey(leftChar)) {

                    mpp.put(leftChar, mpp.get(leftChar) + 1);

                    if (mpp.get(leftChar) > 0) {
                        cnt--;
                    }
                }

                l++;
            }

            r++;
        }

        return st == -1 ? "" : s.substring(st, st + min);
    }
}