class Solution {
    List<List<Integer>> graph;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        this.graph=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }        
        for(int[] pre : prerequisites){
            graph.get(pre[1]).add(pre[0]);
        }
        int[] visited=new int[numCourses];
        
        for(int i=0;i<numCourses;i++){
            if(visited[i]==0){
             if(hasCycle(visited,i)) return false;
            }
        }
        
        return true;
    }
    /*
    0-ziyaret edilmedi
    1-döngü var demek
    2-döngü yok demek
     */
    public boolean hasCycle(int[] visited,int i){
        if(visited[i]==1) return true;
        if(visited[i]==2) return false;
        visited[i]=1;
        for(int j : graph.get(i)){
            if(hasCycle(visited,j)) return true;
        }
        visited[i]=2;
        return false;
    }
}