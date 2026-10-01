class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        final int INF = Integer.MAX_VALUE;
        Queue<int[]> q = new LinkedList<>();

        // 1. Add ALL treasures to the queue
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (grid[i][j] == 0) q.offer(new int[]{i, j});

        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        // 2. BFS outward
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0], c = cur[1];

            for (int[] d : dirs) {
                int nr = r + d[0], nc = c + d[1];
                // in bounds and still unvisited land
                if (nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] == INF) {
                    grid[nr][nc] = grid[r][c] + 1;   // one step farther
                    q.offer(new int[]{nr, nc});
                }
            }
        }
    }
}
