class Solution {
    // bfs kullanacağız 
    // eğer son hakinde halen taze portakal varsa -1 
    // kaç adımda 
    // 2-çürük 1-taze 0-boş
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        Queue<int[]> queue = new ArrayDeque<>();

        int fresh=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0) return 0;
        int[][] directions={{0,1},{1,0},{-1,0},{0,-1}};

        int minutes=-1;

        while(!queue.isEmpty()){
            minutes++;
            int size=queue.size();

            for(int i=0;i<size;i++){
                int[] arr=queue.poll();
                int x=arr[0];
                int y=arr[1];

                for(int[] dir : directions){
                    int nx=x+dir[0];
                    int ny=y+dir[1];

                    if(nx>=0 && ny>=0 && nx<m && ny<n && grid[nx][ny]==1){
                        grid[nx][ny]=2;
                        fresh--;
                        queue.offer(new int[]{nx,ny});
                    }
                }
            }
        }
        return fresh==0 ? minutes : -1 ;
    }
}