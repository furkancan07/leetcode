class Solution {
    public boolean canPartition(int[] nums) {
         int result=0;
        for(int i : nums){
         result+=i;
        }
        if(result%2!=0) return false;
        int target=result/2;

        boolean[] dp=new boolean[target+1];
        dp[0]=true;
        for(int i : nums){
            for(int j=target;j>=i;j--){
                dp[j]=dp[j] || dp[j-i];
            }
        }
        
        return dp[target];
       // 1 5 11 5
       // 11 
       // 11 1 
       // 1 true
       // 5 11 
       // 5 false
       // 11 11 
       // 
    }
     /* public boolean canPartition(int[] nums) {
        int result=0;
        for(int i : nums){
         result+=i;
        }
        if(result%2!=0) return false;
        int target=result/2;
        Arrays.sort(nums);
        return dfs(nums,target,0,0);
        
    }
    public boolean dfs(int[] nums,int target,int count,int index){
        if(target==count){
            return true;
        }

        if(count>target) return false; 
        for(int i=index;i<nums.length;i++){
            if(dfs(nums,target,count+nums[i],i+1)) return true;
        }
        return false;
    }*/
}