class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        path.add(0);
        dfs(0,list,path,graph);
        return list;
    }
    public void dfs(int node,List<List<Integer>> list,List<Integer> path,int[][] graph){
        if(node==graph.length-1){
            list.add(new ArrayList<>(path)); // direk pathi eklemiyoz refaransını ekliyoruz çünkü pathde geri dönüş işlemi yapacaz;
            return ;
        }

        for(int next : graph[node]){
            path.add(next);
            dfs(next,list,path,graph); // 0 1 3  // 0 2 3 
            path.remove(path.size()-1); // 0 
        }
    }
}