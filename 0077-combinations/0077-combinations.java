class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        boolean[] visited=new boolean[n+1];
        dfs(n,k,list,path,visited,1);
        return list;
        
    }
    public void dfs(int n,int k,List<List<Integer>> list,List<Integer> path,boolean[] visited,int index){
        if(path.size()==k){
            list.add(new ArrayList<>(path));
            return;
        }
        for(int i=index;i<=n;i++){
          if(visited[i]) continue;
          path.add(i);
          visited[i]=true;
          dfs(n,k,list,path,visited,i+1);
          visited[i]=false;
          path.remove(path.size()-1);
        }
    }
}