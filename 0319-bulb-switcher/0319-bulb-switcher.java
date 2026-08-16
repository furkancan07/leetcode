class Solution {
   public int bulbSwitch(int n) {
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(i*i<=n) count++;
        }
        return count;
        
    }

    public int bulbSwitchfromUtilsMethod(int n) {
        return (int) Math.sqrt(n);
        
    }

}