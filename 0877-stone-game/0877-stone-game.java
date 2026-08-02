class Solution {
    
    int i;
    int j;
    int[] nums;
      public boolean stoneGame(int[] piles) {
        this.nums=piles;
        int player1=0;
        int player2=0;
        i=0;
        j=nums.length-1;
        while(i<j){
           player1= helper(player1);
            player2=helper2(player2);
        }
        return player1>player2;

    }
    public int helper(Integer player){
        if(nums[i]>nums[j]){
            player+=nums[i];
            i++;
        }else{
            player+=nums[j];
            j--;
        }
        return player;
    }
    public int helper2(int player){
           if(nums[i]<nums[j]){
            player+=nums[i];
            i++;
        }else{
            player+=nums[j];
            j--;
        }
        return player;
    }
}