class Solution {
    // topolojilk sıralama 
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        
        for(int[] pre : prerequisites){
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
    public boolean hasCycle(List<List<Integer>> graph,int[] visited,int i){
        if(visited[i]==1) return true;
        if(visited[i]==2) return false;
        visited[i]=1;
        for(int n : graph.get(i)){
            if(hasCycle(graph,visited,n)) return true;
        }
        visited[i]=2;
        return false;
    }
}