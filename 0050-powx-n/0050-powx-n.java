class Solution {
    public double myPow(double x, int n) {
        double result=1;
        long power=n;
        boolean isNegative=power<0;
        power=Math.abs(power);
        while(power>0){
            if(power%2==1){
                result*=x;
            }
            x=x*x;
            power=power/2;
           // if(result>Integer.MAX_VALUE || result<Integer.MIN_VALUE) return 0;
        }
        return isNegative ? 1/result : result;
    }
   
}