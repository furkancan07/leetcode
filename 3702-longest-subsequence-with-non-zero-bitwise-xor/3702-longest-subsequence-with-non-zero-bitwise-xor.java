class Solution {
    public int longestSubsequence(int[] nums) {
      boolean allZeros=true;
      int result=0;
      for(int i : nums){
        result^=i;
        if(i!=0){
            allZeros=false;
        }
      }
      // 1.durum hepsi 0 sa zaten sonuç 0
      if(allZeros) return 0;
      // 2.durum sonuç 0 değilse o zaman nums.lengthi döndür
      if(result!=0) return nums.length;
      // 3.durum sonuç 0 ama tüm elemanlar 0 değilse 1 tanesini çıkarırsam denge bozulur ve sonuç 0 olmaz
      return nums.length-1;
        
    }


    // bu 10002 test casin 10001 inde çalıştı 1 tanesinde çalışmadı
    public int longestSubsequence2(int[] nums) {
        return helper(0,nums);
        
    }
    public int helper(int index,int[] nums){
        if(index>=nums.length) return 0;
        int result=0;
        for(int i=index;i<nums.length;i++){
            result^=nums[i];
        }
        int length=nums.length-index;
        return result !=0 ? length : helper(index+1,nums);
    }
}