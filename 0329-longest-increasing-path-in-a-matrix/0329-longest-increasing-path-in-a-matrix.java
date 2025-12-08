class Solution {
    int[][] directions={{0,1},{1,0},{0,-1},{-1,0}};
    int[][] matrix;
    int[][] memo;
    int m,n;
    public int longestIncreasingPath(int[][] matrix) {
        this.matrix=matrix;
        this.m=matrix.length;
        this.n=matrix[0].length;
        this.memo=new int[m][n];

        for(int[] row : memo){
            Arrays.fill(row,-1);
        }
        int max=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                max=Math.max(max,dfs(i,j));
            }
        }
        return max+1;
    }
     public int dfs(int i,int j){
        if(memo[i][j]!=-1) return memo[i][j];
        int max=0;
        
        for(int[] dir : directions){
            int nx=i+dir[0];
            int ny=j+dir[1];

            if(nx>=0 && nx<m && ny>=0 && ny<n && matrix[nx][ny]>matrix[i][j]){
                max=Math.max(max,dfs(nx,ny)+1);
            }
        }
        memo[i][j]=max;
       
        return max;
    }
}