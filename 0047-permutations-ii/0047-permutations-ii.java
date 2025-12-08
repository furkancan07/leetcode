class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        Arrays.sort(nums); // aynı olan sayıları yan yana getirmek
        dfs(nums,list,path,visited);
        return list;
    }
    public void dfs(int[] nums,List<List<Integer>> list,List<Integer> path,boolean[] visited){
        if(path.size()==nums.length){
            list.add(new ArrayList<>(path));
            return;
        }

        if(path.size()>nums.length) return ;

        for(int i=0;i<nums.length;i++){
            if(visited[i]) continue;

            if(i>0 && nums[i]==nums[i-1] && !visited[i-1]) continue;

            path.add(nums[i]);
            visited[i]=true;
            dfs(nums,list,path,visited);
            visited[i]=false;
            path.remove(path.size()-1);
        }

    }
}