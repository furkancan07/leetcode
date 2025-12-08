class Solution {
    // <i=0 -> i=n-1 f(j)*f(i-1-j);
    public int numTrees(int n) {
        if(n==0 || n==1) return  1;
        int[] dp=new int[n+1]; 
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            for(int j=0;j<i;j++){
                dp[i]+=dp[j]*dp[i-1-j];
            }
        }

        return dp[n];
    }
}