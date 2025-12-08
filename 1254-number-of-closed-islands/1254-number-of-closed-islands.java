class Solution {
    public int closedIsland(int[][] grid) {
        if(grid.length==0) return 0;
        int rows=grid.length;
        int cols=grid[0].length;
        int count=0;

        for(int i=0;i<rows;i++){
            dfs(grid,i,0);
            dfs(grid,i,cols-1);
        }

         for(int i=0;i<cols;i++){
            dfs(grid,0,i);
            dfs(grid,rows-1,i);
        }
        for(int i=1;i<rows-1;i++){
            for(int j=1;j<cols-1;j++){
              if(grid[i][j]==0){
                dfs(grid,i,j);
                count++;
              }
            }
        }
        return count;
        
    }
    public void dfs(int[][] grid,int i,int j){
        if(i<0 || i>grid.length-1 || j<0 || j>grid[0].length-1 || grid[i][j]==1) return ;
        grid[i][j]=1;
         // yukarı
        dfs(grid,i-1,j);
        // aşağı
        dfs(grid,i+1,j);
        // sol
        dfs(grid,i,j-1);
        // sağ
        dfs(grid,i,j+1);


    }
}