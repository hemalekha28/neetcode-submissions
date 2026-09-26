class Solution {
    public void dfs(int i,int j,char[][] grid,int n,int m,int[][] vis){
        if(i>=0 && i<n && j>=0 && j<m && grid[i][j]!='0' && vis[i][j]==0 ){
            vis[i][j]=1;
            int[] dr={-1,0,1,0};
            int[] dc={0,1,0,-1};
            for(int k=0;k<4;k++){
                dfs(i+dr[k],j+dc[k],grid,n,m,vis);
            }
        }
        else{
            return;
        }
    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis=new int[n][m];
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!='0' && vis[i][j]!=1){
                    dfs(i,j,grid,n,m,vis);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
