class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        dfs(candidates,list,path,target,0,0);
        return list;  
    }
       public void dfs(int[] candidates,List<List<Integer>> list,List<Integer> path,int target,int count,int index){

        if(count==target){
            list.add(new ArrayList<>(path));
            return ;
       }
       if(count>target) return;
       for(int i=index;i<candidates.length;i++){
        if(i>index && candidates[i]==candidates[i-1]) continue;
        
        path.add(candidates[i]);
        
        dfs(candidates,list,path,target,count+candidates[i],i+1);

        path.remove(path.size()-1);
       }

    }
}