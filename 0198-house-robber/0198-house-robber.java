class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        int[] dp=new int[n];
        dp[0]=nums[0];
        dp[1]=nums[1];
        dp[2]=nums[2]+nums[0];
        for(int i=3;i<n;i++){
            for(int j=1;j<i-1;j++){
                dp[i]=nums[i]+Math.max(dp[j],dp[j-1]);
            }
        }
        int max=0;
        for(int i : dp){
            System.out.println(i);
            max=Math.max(max,i);
        }
        return max;
    }
}