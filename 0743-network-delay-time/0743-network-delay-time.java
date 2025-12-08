class Solution {
    /*
    class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        final int INF=1000000;
        int[][] graph=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            Arrays.fill(graph[i],INF);
            graph[i][i]=0;
        }
        for(int[] time : times){
            int u=time[0];
            int v=time[1];
            int w=time[2];
            graph[u][v]=w;
        }
        int[] dist=new int[n+1];
        Arrays.fill(dist,INF);
        dist[k]=0;
        boolean[] visited=new boolean[n+1];

        for(int i=1;i<=n;i++){
            int u=minIndex(graph,dist,visited,n);
            if(u==-1) break;

            for(int v=1;v<=n;v++){
                if(!visited[v] && graph[u][v]<INF && dist[u]+graph[u][v]<dist[v]){
                    dist[v]=dist[u]+graph[u][v];
                }
            }
        }

           int result=0;
            for(int i=1;i<=n;i++){
                if(dist[i]==INF) return -1;
                result=Math.max(result,dist[i]);
            }

            return result;


        
    }
    public int minIndex(int[][] graph,int[] dist,boolean[] visited,int n){
        int index=-1;
        int min=1000000;
        for(int i=1;i<=n;i++){
          if(!visited[i] && dist[i]<min){
            min=dist[i];
            index=i;
          }
        }
        return index;
    }
}

    
    
     */
     // djikstra algoritması
    public int networkDelayTime(int[][] times, int n, int k) {
        final int INF=1000000;
        int[][] graph=new int[n+1][n+1];
      // ilk olarak arrayı kendi kendilerine uzaklık 0 diğerleri sosnuz yap
        for(int i=1;i<=n;i++){
            Arrays.fill(graph[i],INF);
            graph[i][i]=0;
        }
        // diğer time göre graflar arsındaki uzaklığı bul
        for(int[] time : times){
            int u = time[0], v = time[1], w = time[2];
            graph[u][v] = w;
        }

        int[] dist=new int[n+1];
        Arrays.fill(dist,INF);
        dist[k]=0;
        boolean[] visited=new boolean[n+1];

        for(int i=1;i<=n;i++){
            int u=minIndex(dist,visited,n);
            if(u==-1) break;
            visited[u]=true;
            for(int v=1;v<=n;v++){
                if(!visited[v] && graph[u][v]<INF && dist[u]+graph[u][v]<dist[v]){
                    dist[v]=dist[u]+graph[u][v];
                }
            }
        }
        int result=0;
        for(int i=1;i<=n;i++){
            if(dist[i]==INF) return -1;
            result=Math.max(result,dist[i]);
        }
        return result;
    }
    public int minIndex(int[] dist, boolean[] visited, int n){
        int min=1000000;
        int index=-1;
        for(int i=1;i<=n;i++){
            if(!visited[i] && dist[i]<min){
                min=dist[i];
                index=i;
            }
        }
        return index;
    }
}