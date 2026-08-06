class Solution {
    public int smallestNumber(int n, int t) {
       int multi=multiply(n);
       while(true){
         if(multi%t==0) return n;
         multi=multiply(++n);
       }
       
        
    }
    public int multiply(int n){
        int result=1;
        while(n>0){
           result*=n%10;
           n=n/10;
        }
        return result;
    }
}