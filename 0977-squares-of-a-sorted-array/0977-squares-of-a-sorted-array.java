class Solution {
    public int[] sortedSquares(int[] nums) {
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        for(int i : nums){
            heap.offer(i*i);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=heap.poll();
        }
        return nums;
     
    }
}