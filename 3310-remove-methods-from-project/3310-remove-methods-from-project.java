class Solution {
    
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> graph=new ArrayList<>();
       
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] pre : invocations){
            graph.get(pre[0]).add(pre[1]);
        }

        boolean[] visited=new boolean[n];

        dfs(k,graph,visited);

         List<Integer> list=new ArrayList<>();

        for(int[] arr : invocations){
            int from = arr[0];
            int to=arr[1];

            if(!visited[from] && visited[to]){
                for(int i = 0;i<n;i++){
                    list.add(i);
                }
                return list;
            }
        }

       
        for(int i=0;i<n;i++){
            if(!visited[i]) list.add(i);
        }
        return list;

        
        
    }
    public void dfs(int k , List<List<Integer>> graph,boolean[] visited){
        if(visited[k]) return;
        
        visited[k]=true;
        for(int i : graph.get(k)){
            dfs(i,graph,visited);
        }
    }
}
   