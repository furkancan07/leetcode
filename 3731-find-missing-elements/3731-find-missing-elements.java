class Solution {
     public List<Integer> findMissingElements(int[] nums) {
          List<Integer> list=new ArrayList<>();
          Set<Integer> set=new HashSet<>();
          int min=Integer.MAX_VALUE;
          int max=Integer.MIN_VALUE;
          for(int i : nums){
            min=Math.min(i,min);
            max=Math.max(i,max);
            set.add(i);
          }
          for(int i=min;i<max;i++){
            if(!set.contains(i)){
                list.add(i);
            }
          }
          return list;


    }
    public List<Integer> findMissingElements2(int[] nums) {
          List<Integer> list=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int total=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]<min) {
                min=nums[i];
            }if(nums[i]>max) {
                max=nums[i];
            }
            total+=nums[i];
        }
        int length=(max-min)+1;
        int expextedLength=length-nums.length;
        int result=((max+min)*length)/2;
        int expectedSum=result-total;
        if(expectedSum>0){
            int expectedMin=findMin(expextedLength-1, (expectedSum/expextedLength)*2);
            for(int i=0;i<expextedLength;i++) {
                list.add(expectedMin++);
            }
        }

        return list;


    }

    public int findMin(int diff, int sum) {
        int max=(diff+sum)/2;
        return sum-max;
    }
}