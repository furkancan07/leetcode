class Solution {
   public int bulbSwitch2(int n) {
        int count=0;
        for(double i=1;i*i<=n;i++){
            if(i*i<=n) count++;
        }
        return count;
        
    }

    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
        
    }

}