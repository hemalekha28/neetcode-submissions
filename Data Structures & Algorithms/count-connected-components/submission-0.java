class Solution {
    public void dfs(int i,int n,int[] vis,List<List<Integer>> adj){
        if(i<0 || i>=n ) return;
        vis[i]=1;
        for(int neigh : adj.get(i)){
            if(vis[neigh]==0)
                dfs(neigh,n,vis,adj);
        }
    }
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e: edges){
            int u=e[0];
            int v=e[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int cnt=0;
        int[] vis=new int[n];
        Arrays.fill(vis,0);
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                dfs(i,n,vis,adj);
                cnt++;
            }
        }
        return cnt;
    }
}
