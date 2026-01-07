class Solution {
    // topolojilk sıralama 
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer,List<Integer>> graph=new HashMap<>();
        
        
        for(int[] pre : prerequisites){
            graph.putIfAbsent(pre[1],new ArrayList<>());
            graph.get(pre[1]).add(pre[0]);
        }
        int[] visited=new int[numCourses];
        for(int i=0;i<numCourses;i++){
         if(visited[i]==0){
            if(hasCycle(graph,visited,i)) return false;
         }
        }
        return true;
    }
    public boolean hasCycle(Map<Integer,List<Integer>> graph,int[] visited,int i){
        if(visited[i]==1) return true;
        if(visited[i]==2) return false;
        visited[i]=1;
        if (graph.containsKey(i)) {
            for (int n : graph.get(i)) {
                if (hasCycle(graph, visited, n)) return true;
            }
        }
        visited[i]=2;
        return false;
    }
}