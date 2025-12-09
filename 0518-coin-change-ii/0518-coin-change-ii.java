class Solution {
   /* public int change(int amount, int[] coins) {

         int[] dp=new int[amount+1];
         dp[0]=1;
         
            for(int coin : coins){
                for(int i=coin;i<=amount;i++){
                  dp[i]+=dp[i-coin];
                }
               
                
            }
         
        return dp[amount];
    } */ 
    
    public int change(int amount, int[] coins) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        dfs(list, path, coins, amount, 0, 0);
        return list.size();
    }

    public void dfs(List<List<Integer>> list,
                    List<Integer> path,
                    int[] coins,
                    int target,
                    int count,
                    int index) {

        if (count == target) {
            list.add(new ArrayList<>(path));
            return;
        }

        if (count > target) return;

        for (int i = index; i < coins.length; i++) {
            path.add(coins[i]);
            dfs(list, path, coins, target, count + coins[i], i); 
            path.remove(path.size() - 1);
        }
    }
}

