class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        dfs(k,n,list,path,1,0);
        return list;
    }
    public void dfs(int k,int n,List<List<Integer>> list,List<Integer> path,int index,int count){

       if(path.size()==k && count==n){
        list.add(new ArrayList<>(path));
        return;
       }
       if(path.size()>k) return;
       if(count>n) return;
       for(int i=index;i<=9;i++){
          path.add(i);
          dfs(k,n,list,path,i+1,count+i);
          path.remove(path.size()-1);
       }
    }
}