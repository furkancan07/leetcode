class Solution {
    int nums[];
    
    public int pivotIndex(int[] nums) {
       this.nums=nums;
       
        
        for(int i=0;i<nums.length;i++){
            if(sum(0,i)==sum(i+1,nums.length)) return i;
        }
        return  -1;

       

        
    }
  
    public int sum(int i,int j){
        int result=0;
        for(int a=i;a<j;a++){
            result+=nums[a];
        }
        return result;
    }
    
}