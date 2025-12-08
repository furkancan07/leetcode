class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int result=89;
        for(int i : nums1){
            for(int j : nums2){
               result=Math.min(result,i==j ? i : Math.min(i*10+j,j*10+i));
            }
        }
        return result;
    }
    public int minNumber2(int[] nums1, int[] nums2) {
        int min1=nums1[0];
        
        Set<Integer> set=new HashSet<>();
        Arrays.sort(nums2);
        int min2=nums2[0];
        for(int i : nums1){
            set.add(i);
        }
        for(int i=1;i<nums1.length;i++){
            min1=Math.min(min1,nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])) return nums2[i];
        }
        int result=min1*10+min2;
        int min=Math.min(result,min2*10+min1);
        return min;
        
    }
}