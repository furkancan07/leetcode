class Solution {
    int dest;
    // find union en iyi yol
 public boolean validPath(int n, int[][] edges, int source, int destination) {
      int[] parent=new int[n];
      for(int i=0;i<n;i++){
        parent[i]=i;
      }
      for(int[] edge:edges){
        union(edge[0],edge[1],parent);
      }
      return find(source,parent)==find(destination,parent);
        
    }
    public void union(int x,int y,int[] parent){
       int rootX=find(x,parent);
       int rootY=find(y,parent);
       if(rootX!=rootY){
        parent[rootX]=rootY;
       }
    }
    public int find(int x,int[] parent){
       if(x!=parent[x]){
        parent[x]=find(parent[x],parent);
       }
       return parent[x];
    }

    public boolean validPathForBfs(int n, int[][] edges, int source, int destination) {
        boolean[] visited=new boolean[n];
        // map bellekte çok yer kapladığı için time limit hatası aldı
       /* Map<Integer,List<Integer>> graph=new HashMap<>();
        for(int[] edge : edges){
            graph.computeIfAbsent(edge[0],ArrayList::new).add(edge[1]);
            graph.computeIfAbsent(edge[1],ArrayList::new).add(edge[0]);
        }*/

        List<List<Integer>> graph=new ArrayList<>();
       
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] pre : edges){
            graph.get(pre[0]).add(pre[1]);
            graph.get(pre[1]).add(pre[0]);
        }
        Queue<Integer> queue=new ArrayDeque<>();
        queue.offer(source);
        visited[source]=true;
        while(!queue.isEmpty()){
            int current=queue.poll();
            if(current==destination) return true;
            for(int i : graph.get(current)){
                if(!visited[i]){
                    visited[i]=true;
                    queue.offer(i);
                
                }
                
            }
        }
        return false;
        
    }
    public boolean validPathForDfs(int n, int[][] edges, int source, int destination) {
        boolean[] visited=new boolean[n];
        Map<Integer,List<Integer>> graph=new HashMap<>();
        for(int[] edge : edges){
            graph.computeIfAbsent(edge[0],ArrayList::new).add(edge[1]);
            graph.computeIfAbsent(edge[1],ArrayList::new).add(edge[0]);
        }
        this.dest=destination;
       return dfs(source,visited,graph);
        
    }
    public boolean dfs(int source,boolean[] visited,Map<Integer,List<Integer>> graph){
        if(source==dest) return true;
        visited[source]=true;
        
        for(int i : graph.getOrDefault(source,new ArrayList<>())){
           if(!visited[i]){
             if(dfs(i,visited,graph)) return true;
           }
        }
        return false;
    }
}