class Solution {
  /*     public int uniquePaths(int m, int n) {
        if(m==0 || n==0) return 0;
        if(m==1 || n==1) return 1;
       // return uniquePaths(m-1,n)+uniquePaths(m,n-1);
        return factorial(m-1+n-1)/(factorial(m-1)*factorial(n-1));  
    }
    public int factorial(int m){
        if(m==0) return 1;
        long result=1;
        for(int i=1;i<=m;i++){
        result*=i;
        }
        return (int) result;
    }*/
    public int uniquePaths(int m, int n) {
        if(m==0 || n==0) return 0;
        if(m==1 || n==1) return 1;

        int[][] dp=new int[m][n];

        for(int i=0;i<m;i++){
            dp[i][0]=1;
        }
        for(int j=0;j<n;j++){
            dp[0][j]=1;
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}