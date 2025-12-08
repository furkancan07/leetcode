class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        dfs(list,path,candidates,target,0,0);
        return list;
        
    }
    public void dfs(List<List<Integer>> list, List<Integer> path,int[] candidates,int target,int count,int index){
        
        
        if(count==target){
            list.add(new ArrayList<>(path));
            return;
        }
       
        if(count>target) return;
        for(int i=index;i<candidates.length;i++){
            path.add(candidates[i]);
            dfs(list,path,candidates,target,count+candidates[i],i);
            path.remove(path.size()-1);
        }
    }
}