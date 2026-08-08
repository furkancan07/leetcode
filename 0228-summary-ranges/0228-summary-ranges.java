class Solution {
     public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        if(nums.length==1) list.add(String.valueOf(nums[0]));
        String before=null;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1!=nums[i+1]){
                if(before!=null){ list.add(before+"->"+nums[i]); before=null; }
                else  list.add(String.valueOf(nums[i]));
                if(i==nums.length-2){
                    list.add(String.valueOf(nums[nums.length-1]));
                }


            }else{
                if(before==null) before=String.valueOf(nums[i]);
                if(i==nums.length-2){
                    list.add(before+"->"+nums[nums.length-1]);
                }
            }
        }
      /*  if(!list.equals(String.valueOf(nums[nums.length-1]))){
            list.add(String.valueOf(nums[nums.length-1]));
        }*/
        return list;


    }
   
}