class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n=grid.length;

        int[] dp=new int[n];

        for(int i=0;i<n;i++){
            dp[i]=grid[n-1][i];
        }

        for(int i=n-2;i>=0;i--){
            int[] newDp=new int[n];
            for(int j=0;j<n;j++){
                 int min=Integer.MAX_VALUE;
                 for(int k=0;k<n;k++){
                    if(j!=k){
                        min=Math.min(min,dp[k]);
                    }
                 }
                 newDp[j]=grid[i][j]+min;
            }
            dp=newDp;
        }

        int min=Integer.MAX_VALUE;
        for(int i : dp){
            min=Math.min(min,i);
        }
        return min;
        
    }
}