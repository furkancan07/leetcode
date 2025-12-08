class Solution {
    public int[][] updateMatrix(int[][] mat) {
       int m=mat.length;
       int n=mat[0].length;
       int[][] dist=new int[m][n];
       if(m==0) return dist;
       Queue<int[]> bfs=new LinkedList<>();

       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(mat[i][j]==0){
              bfs.offer(new int[]{i,j});
            }else{
                dist[i][j]=10001;
            }
        }
       }
       int[][] directions={{1,0}, {-1,0}, {0,1}, {0,-1}};
       while(!bfs.isEmpty()){
        int[] cell=bfs.poll();
        int row=cell[0];
        int col=cell[1];

        for(int[] dir : directions){
             int newRow=row+dir[0];
             int newCol=col+dir[1];

             if(newRow>=0 && newRow<m && newCol>=0 && newCol<n){
                if(dist[newRow][newCol]>dist[row][col]+1){
                    dist[newRow][newCol]=dist[row][col]+1;
                    bfs.offer( new int[]{newRow,newCol});
                }
             }
        }

       }
       return dist;
    }
}