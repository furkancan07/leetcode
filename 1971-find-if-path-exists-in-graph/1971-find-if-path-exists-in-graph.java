class Solution {
    int dest;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] visited=new boolean[n];
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
    public boolean validPath2(int n, int[][] edges, int source, int destination) {
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