class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
      
        dfs(n,k,list,path,1);
        return list;
        
    }
    public void dfs(int n,int k,List<List<Integer>> list,List<Integer> path,int index){
        if(path.size()==k){
            list.add(new ArrayList<>(path));
            return;
        }
        for(int i=index;i<=n;i++){
          
          path.add(i);
         
          dfs(n,k,list,path,i+1);
          
          path.remove(path.size()-1);
        }
    }
}