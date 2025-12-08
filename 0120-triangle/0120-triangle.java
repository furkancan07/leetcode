class Solution {
  /*  public int minimumTotal(List<List<Integer>> list) {
        int count=list.get(0).get(0);

        int index=0;

        for(int i=1;i<list.size();i++){
            List<Integer> row=list.get(i);
            if(row.size()>index+1){
                if(row.get(index)<=row.get(index+1)){
                    count+=row.get(index);
                }else{
                    count+=row.get(index+1);
                    index++;
                }

            }else{
                count+=row.get(index);
            }
        }
      return count;
    }*/
     public int minimumTotal(List<List<Integer>> list){
      int n=list.size();
      if(n==0) return 0;
      int[] dp=new int[n];
      for(int i=0;i<n;i++){
      dp[i]=list.get(n-1).get(i);
      }

      for(int i=n-2;i>=0;i--){
        for(int j=0;j<=i;j++){
            dp[j]=list.get(i).get(j)+Math.min(dp[j],dp[j+1]);
        }
      }
return dp[0];

     }
}