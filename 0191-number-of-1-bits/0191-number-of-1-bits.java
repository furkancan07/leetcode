/**
  şimdi olay şu benim amacım en sağdaki1 leri 0 yaoarak nums değeri 0 olana kadar ilerlemek
  bunun sonucunda kaç seferd bittiğini yazarsak sonucu buluruz sağdaki 1 leri 0 yapmak için de n&n-1
  kullanabiliriz;

 */

class Solution {
    public int hammingWeight(int n) {
        if(n==0) return 0;
        int result=0;
        while(n!=0){
            n=n&(n-1);
            result++;
        }
        return result;
        
    }
}