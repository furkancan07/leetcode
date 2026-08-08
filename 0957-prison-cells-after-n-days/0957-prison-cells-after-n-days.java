class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
        Map<String,Integer> map=new HashMap<>();
        int day=0;
        int[] before=cells.clone();
        while (day<n){
            String key=Arrays.toString(cells);
            if(map.containsKey(key)){
                int cycleStart=map.get(key);
                int cycleLength=day-cycleStart;
                int remainder=(n-cycleStart)%cycleLength;
                for(int i=0;i<remainder;i++){
                    before=helper(before,cells);
                }
                return cells;
            }
            map.put(key,day);
            before=helper(before,cells);
            day++;
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