class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        if(n==0) return 0;
        int[] dp=new int[n];
        for(int j=0;j<n;j++){
            dp[j]=matrix[n-1][j];
        }

        for(int i=n-2;i>=0;i--){
             int[] newDp=new int[n];
            for(int j=0;j<n;j++){
              int min=dp[j];
              if(j-1>=0){
                min=Math.min(min,dp[j-1]);
              }if(j+1<n){
                min=Math.min(min,dp[j+1]);
              }
              newDp[j]=matrix[i][j]+min;
               
            }
            dp=newDp;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
          min=Math.min(min,dp[i]);
        }
        return min;
        
    }
}