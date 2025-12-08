class Solution {
    public int longestConsecutive(int[] nums) {
      /*  Set<Integer> set=new HashSet<>();
        int result=0;
        for(int i: nums){
            set.add(i);
        }
        for(int i : set){
            if(!set.contains(i-1)){
                int current=i;
                int counter=1;
                while(set.contains(current+1)){
                   current++;
                   counter++;
                }
              result=Math.max(result,counter);
            }
            
        }
        return result;*/
        if (nums.length == 0) return 0;
        int max=1;
        int result=1;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
           
            if(nums[i]-nums[i-1]==1){
                result++;
                max=Math.max(max,result);
            }
            else if(nums[i]==nums[i-1]){
                continue;
            }
            else{
                result=1;
            }
            // kalan elemanlarla beraber halen mexı geçmiyorsa boşuna bakma 
            if (nums.length - i + result <= max) break;
        }
        return max;

   
        
    }
}