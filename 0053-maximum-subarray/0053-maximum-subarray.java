class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0]; // max ,before  -2
        int before=nums[0]; // nums[i],before+nums[i] -2 
       
        for(int i=1;i<nums.length;i++){
            before=Math.max(nums[i],before+nums[i]); // 1 1 5 4 6 1 5
            max=Math.max(max,before); // 1 1 5 5 6 6 6
        }
         return max;
        
    }
}