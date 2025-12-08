class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        dfs(nums,list,path,visited);
        return list;
    }
    public void dfs(int[] nums,List<List<Integer>> list,List<Integer> path,boolean[] visited){
        if(path.size()==nums.length){
            list.add(new ArrayList<>(path));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]){
           continue;
            } 
              path.add(nums[i]);
        visited[i]=true;
            dfs(nums,list,path,visited); // 1 2 3 , 1 
           
            path.remove(path.size()-1);
             visited[i]=false;
            

        }
    }
}