class Solution {
    public int[] sortArray(int[] nums) {
        countSort(nums);
        return nums;
    }
    public void countSort(int[] nums){
        int[] count=new int[100001];
        int offset=50000;

        for(int i : nums){
            count[i+offset]++;
        }
        int index=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                nums[index++]=i-offset;
                count[i]--;
            }
        }
        
    }
}