class Solution {
    public int climbStairs(int n) {
      if(n<=2) return n;
      int a=1;
      int b=1;
      int c=a+b;
      for(int i=3;i<=n;i++){
        a=b;
        b=c;
        c=a+b;
      }
      return c;
    }
}