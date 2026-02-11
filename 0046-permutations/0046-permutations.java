class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        dfs(list,path,visited,nums);
        return list;
    }
    // dene ilerle geri dön
    public void dfs(List<List<Integer>> list,List<Integer> path,boolean[] visited,int[] nums){
        if(path.size()==nums.length){
            list.add(new ArrayList<>(path));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]) continue;
            path.add(nums[i]);
            visited[i]=true;
            dfs(list,path,visited,nums);
            visited[i]=false;
            path.remove(path.size()-1);
        }

    }
}