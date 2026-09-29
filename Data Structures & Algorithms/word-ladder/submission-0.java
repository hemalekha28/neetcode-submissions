class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q=new LinkedList<>();
        Set<String> set=new HashSet<>();
        for(String lst : wordList){
            set.add(lst);
        }
        set.remove(beginWord);
        q.add(new Pair(beginWord,1));
        while(!q.isEmpty()){
            String word=q.peek().first;
            int steps=q.peek().second;
            q.remove();
            if(word.equals(endWord)==true) return steps;
            for(int i=0;i<word.length();i++){
                for(char ch='a';ch<='z';ch++){
                    char[] replacedWord=word.toCharArray();
                    replacedWord[i]=ch;
                    String rep=new String(replacedWord);
                    if(set.contains(rep)){
                        set.remove(rep);
                        q.add(new Pair(rep,steps+1));
                    }
                }
            }
        }
        return 0;
    }
}
class Pair{
    String first;
    int second;
    Pair(String first,int second){
        this.first=first;
        this.second=second;
    }
}
