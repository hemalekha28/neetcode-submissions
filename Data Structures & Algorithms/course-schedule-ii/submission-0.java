class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();      
        int[] finl=new int[numCourses];
        for(int i=0;i<numCourses;i++) adj.add(new ArrayList<>()); 
        for(int e[] : prerequisites){
            int u=e[0];
            int v=e[1];
            adj.get(v).add(u);
        }
        int[] indegree=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(int it : adj.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int cnt=0;
        int i=0;
        while(!q.isEmpty()){
            int num=q.poll();
            finl[i++]=num;
            cnt++;
            for(int n : adj.get(num)){
                indegree[n]--;
                if(indegree[n]==0){
                    q.add(n);
                }
            }
        }
        return cnt==numCourses? finl : new int[]{};

    }
}
