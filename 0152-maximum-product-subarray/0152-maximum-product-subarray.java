class Solution {
    public int maxProduct(int[] nums) {
    int max=nums[0]; 
    int before=nums[0]; 
    int min=nums[0];
       
        for(int i=1;i<nums.length;i++){
            int temp=before;
            before=Math.max(nums[i],Math.max(before*nums[i],min*nums[i]));
            min=Math.min(nums[i],Math.min(temp*nums[i],min*nums[i]));
            max=Math.max(before,max);
        }
         return max;
        
    }
   /*  public int maxProduct(int[] nums) {
    int n=nums.length;
    int l=1;
    int r=1;
    int res=nums[0];
    for(int i=0;i<n;i++){
        l=l==0 ? 1 : l;
        r=r==0 ? 1 : r;
        l*=nums[i];
        r*=nums[n-1-i];
        res=Math.max(res,Math.max(l,r));
    }
    return res;
     }*/
}