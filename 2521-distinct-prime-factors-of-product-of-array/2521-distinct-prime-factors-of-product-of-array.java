class Solution {
    public int distinctPrimeFactors(int[] nums) {
        if(nums.length==0) return 0;
        Set<Integer> set=new HashSet<>();
        for(int i : nums){
            helper(i,set);
        }
        return set.size();
    } 
    public void helper(int bolunen,Set<Integer> set){
        int bolen=2;
        while(bolunen>=bolen){
            if(bolunen%bolen==0){
                bolunen=bolunen/bolen;
                set.add(bolen);
            }else{
                bolen++;
            }
        }
    }
}