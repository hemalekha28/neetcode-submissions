class FreqStack {
    Map<Integer,Integer> freqmap;
    Map<Integer,Stack<Integer>> stkmap;
    int maxfreq;
    public FreqStack() {
        freqmap=new HashMap<>();
        stkmap=new HashMap<>();
        maxfreq=0;
    }
    
    public void push(int val) {
        int freq=freqmap.getOrDefault(val,0)+1;
        freqmap.put(val,freq);
        if(!stkmap.containsKey(freq)){
            stkmap.put(freq,new Stack<>());
        }
        stkmap.get(freq).push(val);
        maxfreq=Math.max(freq,maxfreq);
    }
    
    public int pop() {
        Stack<Integer> stk=stkmap.get(maxfreq);
        int val=stk.pop();
        freqmap.put(val,freqmap.get(val)-1);
        if(stk.isEmpty()){
            maxfreq--;
        }
        return val;
    }
}
