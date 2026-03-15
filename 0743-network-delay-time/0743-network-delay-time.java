class Solution {
    int max=1001;
    public int networkDelayTime(int[][] times, int n, int k) {
        
        int[][] graph=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            Arrays.fill(graph[i],max);
            graph[i][i]=0;
        }
        for(int[] time : times){
            int x=time[0];
            int y=time[1];
            int z=time[2];
            graph[x][y]=z;
        } 
        int[] dist=new int[n+1];
        boolean[] visited=new boolean[n+1];
        Arrays.fill(dist,max);
        dist[k]=0;
        for(int i=1;i<=n;i++){
            int u=minIndex(dist,visited);
            if(u==-1) break;
            visited[u]=true;
            for(int v=1;v<=n;v++){
             if(!visited[v] && dist[u]+graph[u][v]<dist[v]){
                dist[v]=dist[u]+graph[u][v];
             }
            }
        }

      int result=0;
       
       for(int i=1;i<=n;i++){
        if(dist[i]==max) return -1;
        result=Math.max(dist[i],result);
       }
        return result;
        
    }
    public int minIndex(int[] dist,boolean[] visited){
        int index=-1;
        int min=max;
        for(int i=1;i<dist.length;i++){
            if(dist[i]<min && !visited[i]){
                index=i;
                min=dist[i];
            }
        }
        return index;
    }
}