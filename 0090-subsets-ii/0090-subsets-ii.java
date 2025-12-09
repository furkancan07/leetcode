class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         List<List<Integer>> list=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        Arrays.sort(nums);
        dfs(list,path,nums,0);
        return list;
        
    }

       public void dfs(List<List<Integer>> list,List<Integer> path,int[] nums,int index){

        list.add(new ArrayList<>(path));

        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]) continue;
            path.add(nums[i]);
            dfs(list,path,nums,i+1);
            path.remove(path.size()-1);
        }

    }
}