class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        Queue<Pair> q=new LinkedList<>();
        int cntFresh=0;
        int[][] vis=new int[m][n];
        int tm=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    cntFresh++;
                }
                else if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    vis[i][j]=2;
                }
                else{
                    vis[i][j]=0;
                }
            }
        }
        int cnt=0;
        while(!q.isEmpty()){
            int r=q.peek().r;
            int c=q.peek().c;
            int t=q.peek().tm;
            q.remove();
            tm=Math.max(t,tm);
            int[] dr={-1,0,1,0};
            int[] dc={0,1,0,-1};
            for(int i=0;i<4;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];
                 if(nr>=0 && nr<m && nc>=0 && nc<n && grid[nr][nc]==1 && vis[nr][nc]==0){
                    q.add(new Pair(dr[i]+r,dc[i]+c,t+1));
                    cnt++;
                    vis[nr][nc]=2;
                }
            }
        }
        return cnt==cntFresh ? tm :-1;
    }
}
class Pair{
    int r;
    int c;
    int tm;
    Pair(int r,int c,int tm){
        this.r=r;
        this.c=c;
        this.tm=tm;
    }
}
