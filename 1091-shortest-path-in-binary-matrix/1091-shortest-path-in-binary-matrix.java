class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
         int n=grid.length;
        if(grid[0][0]!=0 || grid[n-1][n-1]!=0) return -1;
        ArrayDeque<int[]> queue=new ArrayDeque<>();
        int[][] directions={{1,0},{-1,0},{0,1},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
        queue.offer(new int[]{0,0,1});
        while(!queue.isEmpty()){
            int[] array=queue.poll();
            int x=array[0];
            int y=array[1];
            int dist=array[2];
            if(x==n-1 && y==n-1) return dist;
            for(int[] dir : directions){
                int nx=x+dir[0];
                int ny=y+dir[1];
                if(nx>=0 && ny>=0 && nx<n && ny<n && grid[nx][ny]==0){
                    grid[nx][ny]=dist+1;
                    queue.offer(new int[]{nx,ny,dist+1});
                } 
                
            }
        }
        
        return -1;
    }
}