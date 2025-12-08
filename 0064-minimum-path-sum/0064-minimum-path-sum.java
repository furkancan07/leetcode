class Solution {
    // djikstra A*
    // dp
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
       
        for(int i=1;i<m;i++){
            grid[i][0]+=grid[i-1][0];
        }
        for(int i=1;i<n;i++){
            grid[0][i]+=grid[0][i-1];
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                grid[i][j]+=Math.min(grid[i-1][j],grid[i][j-1]);
            }
        }
        return grid[m-1][n-1];
    }
     public int minPathSum2(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dist=new int[m][n];
        int[][] directions={{0,1},{1,0}};
        for(int[] i : dist){
            Arrays.fill(i,Integer.MAX_VALUE);
        }
        dist[0][0]=grid[0][0];
        PriorityQueue<int[]> heap=new PriorityQueue<>((a,b)->Integer.compare(a[2],b[2]));
        heap.offer(new int[]{0,0,dist[0][0]});
        while(!heap.isEmpty()){
            int[] array=heap.poll();
            int x=array[0];
            int y=array[1];
            int cost=array[2];
            if(x==m-1 && y==n-1) return cost;
            for(int[] dir : directions ){
                int nx=x+dir[0];
                int ny=y+dir[1];
                if(nx<m && ny<n && cost+grid[nx][ny]<dist[nx][ny]){
                    dist[nx][ny]=cost+grid[nx][ny];
                    heap.offer(new int[]{nx,ny,dist[nx][ny]});
                }
            }
        }
        return -1;
        
    }
      
}