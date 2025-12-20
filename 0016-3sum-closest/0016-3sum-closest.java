class Solution {
    public int threeSumClosest(int[] nums, int target) {
         

       

        Arrays.sort(nums);
        int sum=nums[0]+nums[1]+nums[2];
        int min=Math.abs(target-sum);
        
        for(int i=0;i<nums.length-1;i++){
            //if (i > 0 && nums[i] == nums[i-1]) continue;
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
            int result=nums[left]+nums[right]+nums[i];
            int m=Math.abs(target-result);
            if(m<min){
                min=m;
                sum=result;
            }
             if(result<target){
               // result=Math.min(a,result);
                left++;
              
                //while(left<right && nums[left]==nums[left-1]) left++;
                //while(left<right && nums[right]==nums[right+1]) right--;
                
            }
            else right--;
        }
        }
        
        return sum;
        
    }
}