class Solution {
    public boolean canJump(int[] nums) {
        int jump=nums[0];
        
        while(jump<nums.length){
            if(jump>=nums.length-1) return true;
            else if(nums[jump]==0) break;
            else jump+=nums[jump];
        }
       if(jump>=nums.length-1) return true;
        return false;
        
    }
}