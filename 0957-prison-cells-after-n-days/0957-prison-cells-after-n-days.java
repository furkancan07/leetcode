class Solution {
      public int[] prisonAfterNDays(int[] cells, int n) {
        int[] dp=cells.clone();
        Map<String,Integer> seen = new HashMap<>();
        int i=0;
        while(i<n){
            String key = Arrays.toString(cells);
            if(seen.containsKey(key)){
                int cycleStart = seen.get(key);
                int cycleLen = i - cycleStart;
                int remaining = (n - cycleStart) % cycleLen;
                for(int k=0;k<remaining;k++){
                    dp = helper(dp,cells);
                }
                return cells;
            }
            seen.put(key,i);
            dp= helper(dp,cells);
            i++;
        }

        return cells;
    }
    public int[] helper(int[] dp,int[] cells){
        for(int i=1;i<cells.length-1;i++){
            if(dp[i-1]==dp[i+1]) cells[i]=1;
            else cells[i]=0;
        }
        cells[0]=0;
        cells[cells.length-1]=0;
        dp=cells.clone();
        return dp;

    }
}