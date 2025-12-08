class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] pre :prerequisites){
            graph.get(pre[1]).add(pre[0]);
        }
        int[] visited=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(visited[i]==0){
                if(dfs(graph,visited,i,stack)) return new int[]{};
            }
        }
        int[] array=new int[numCourses];
        int index=0;
        while(!stack.isEmpty()){
            array[index++]=stack.pop();
        }
        return array;
         
    }
    public boolean dfs(List<List<Integer>> graph,int[] visited,int i,Stack<Integer> stack){
        if(visited[i]==1) return true;
        if(visited[i]==2) return false;

        visited[i]=1;
        for(int n : graph.get(i)){
          if(dfs(graph,visited,n,stack)) return true;
        }
        visited[i]=2;
        stack.push(i);
        return false;
    }
}