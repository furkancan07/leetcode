class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x!=0 && x%10==0)) return false;
        int temp=x;
        int result=0;
        while(x>0){
          int remainder=x%10;
          result=result*10+remainder;
          x=x/10;
        }
        return result==temp;
    }
}