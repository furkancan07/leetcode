class Solution {
    public int missingNumber(int[] nums) {
        int max=nums.length;
        int result=(max*(max+1))/2;
        int temp=0;
        for(int i : nums){
         temp+=i;
        }
        return result-temp;
       /*  int xor=0;
        for(int i : nums){
            xor^=i;
        }

        for(int i=0;i<=nums.length;i++){
            xor^=i;
        }
        return xor;*/
        
    }
}