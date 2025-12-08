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
        }
        for(int i=index;i<=n;i++){
          
          path.add(i);
          
          dfs(n,k,list,path,visited,i+1);
          
          path.remove(path.size()-1);
        }
    }
}