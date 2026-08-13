class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int[] dp=new int[nums.length];
        dp[0]=1;
        for(int i=1;i<nums.length;i++){
         dp[i]=1;
            if(nums[i]>nums[i-1]){
              dp[i]+=dp[i-1];
            }
                   
        }
        int max=0;
        for(int i : dp){
            max=Math.max(i,max);
        }
        return max;
        
    }
}