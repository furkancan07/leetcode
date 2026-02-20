class Solution {
    int[] clone;
    public void rotate(int[] nums, int k) {
        this.clone=nums.clone();
         helper(0,nums,k);
         
    
    }
    public void helper(int index,int[] nums,int k){
        if(index>=nums.length) return;
        if(index+k<nums.length) {
            nums[index+k]=clone[index];
            }else{
                int i=(index+k)%nums.length;
                nums[i]=clone[index];
            }
             helper(index+1,nums,k);
    }
}