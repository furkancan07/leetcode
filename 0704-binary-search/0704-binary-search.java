class Solution {
    public int search(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        
        while(i<=j){
            int med=i+(j-i)/2;
            if(nums[med]==target) return med;
            else if(nums[med]>target) j=med-1;
            else i=med+1;
        }
        return -1;
        
    }
}