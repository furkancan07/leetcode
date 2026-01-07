class Solution {
    public int addDigits(int num) {
        if(num<=9) return num;
        int result=0;
        while(num>0){
            int mod=num%10;
            result+=mod;
            num=num/10;
        }
        return addDigits(result);
    }
}