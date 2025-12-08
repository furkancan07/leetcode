class Solution {
    int[][] directions={{-1,1},{0,1},{1,1}};
    public int maxMoves(int[][] grid) {
      if(grid.length==0) return 0;
      int m=grid.length;
      int n=grid[0].length;

      int[][] memo=new int[m][n];

      for(int[] row : memo){
        Arrays.fill(row,-1);
      }

      int max=0;
      for(int i=0;i<m;i++){
        max=Math.max(max,dfs(grid,memo,i,0,m,n));
      }
      return max;
        
    }
    public int dfs(int[][] grid,int[][] memo,int i,int j,int m,int n){
        if(memo[i][j]!=-1) return memo[i][j];
        int max=0;
        
        for(int[] dir : directions){
            int nx=i+dir[0];
            int ny=j+dir[1];

            if(nx>=0 && nx<m && ny>=0 && ny<n && grid[nx][ny]>grid[i][j]){
                max=Math.max(max,dfs(grid,memo,nx,ny,m,n)+1);
            }
        }
        memo[i][j]=max;
       
        return max;
    }
}