class Solution {
    public boolean isUgly(int n) {
        if(n==1) return true;
        if(n<=0) return false;
        int bolen=2;
        int bolunen=n;
        while(bolunen>=bolen){
            if(bolen>5) return false;;
            if(bolunen%bolen==0){
               
                bolunen=bolunen/bolen;
            }else{
                bolen++;
            }
        }
        return true;
    }
}