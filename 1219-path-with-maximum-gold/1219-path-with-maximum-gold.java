class Solution {
    int[][] directions={{0,1},{1,0},{-1,0},{0,-1}};
    int m;
    int n;
    int[][] grid;
    public int getMaximumGold(int[][] grid) {
        this.grid=grid;
        int max=0;
         m=grid.length;
         n=grid[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                    max=Math.max(max,dfs(i,j));
                }
            }
        }
        return max;
    }
    public int dfs(int i,int j){
         if(i<0 || i>=m || j<0 || j>=n || grid[i][j]==0) return 0;

         int back=grid[i][j];
         int localMax=0;
         grid[i][j]=0;

         for(int[] dir : directions){
            int nx=i+dir[0];
            int ny=j+dir[1];

            localMax=Math.max(localMax,dfs(nx,ny));
         }

         grid[i][j]=back;
         return localMax+grid[i][j];
    }
}