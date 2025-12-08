class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length==0) return 0;
        int col=grid.length;
        int row=grid[0].length;
        int count=0;
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(char[][] grid,int i,int  j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]=='0') return;
        grid[i][j]='0';
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