class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if(grid.length==0) return 0;
        int col=grid.length;
        int row=grid[0].length;
        int max=0;
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                if(grid[i][j]==1){
                    max=Math.max(max,dfs(grid,i,j));
                }
            }
        }
        return max;
    }
    public int dfs(int[][] grid,int i,int j){
        if(i<0 || i>grid.length-1 || j<0 || j>grid[0].length-1 || grid[i][j]==0) return 0;
       
        int count=1;
        grid[i][j]=0;
        
         // yukarı
        count+=dfs(grid,i-1,j);
        // aşağı
        count+=dfs(grid,i+1,j);
        // sol
        count+=dfs(grid,i,j-1);
        // sağ
        count+=dfs(grid,i,j+1);
        return count;
    }
}