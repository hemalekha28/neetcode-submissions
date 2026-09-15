class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk=new Stack<>();
        for(int num : asteroids){
            if(num>0){
                stk.push(num);
            }
            else{
                boolean destroyed=false;
                while(!stk.isEmpty() && stk.peek()>0){
                    int v1=stk.peek();
                    if(Math.abs(num)==Math.abs(v1)){
                        stk.pop();
                        destroyed=true;
                        break;
                    }
                    else if(Math.abs(v1)<Math.abs(num)){
                            stk.pop();
                    }
                    else{
                        destroyed=true;
                        break;
                    }
                    

                }
                if(!destroyed){
                    stk.push(num);
                }
            }
        }
        int[] arr=new int[stk.size()];
        for(int i=stk.size()-1;i>=0;i--){
            arr[i]=stk.pop();
        }
        return arr;

    }
}