class Solution {
    public int dfs(int i,int j,int[][] grid,int n,int m,int[][] vis){
        if(i>=0 && i<n && j>=0 && j<m && grid[i][j]!=0 && vis[i][j]==0 ){
            vis[i][j]=1;
            int area=1;

            int[] dr={-1,0,1,0};
            int[] dc={0,1,0,-1};
            for(int k=0;k<4;k++){
                area+=dfs(i+dr[k],j+dc[k],grid,n,m,vis);
            }
            return area;
        }
        else{
            return 0;
        }
    }
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis=new int[n][m];
        int cnt=0;
        int maxArea=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!=0 && vis[i][j]!=1){
                    int area=dfs(i,j,grid,n,m,vis);
                    maxArea=Math.max(area,maxArea);
                }
            }
        }
        return maxArea;
    }
}

